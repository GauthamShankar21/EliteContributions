# Define the initial and final states
INITIAL_STATE = (3, 3, 1)
FINAL_STATE = (0, 0, 0)

# Define the valid moves
MOVES = [(2, 0), (1, 0), (1, 1), (0, 1), (0, 2)]

# Define the state class
class State:
    def __init__(self, missionaries, cannibals, boat):
        self.missionaries = missionaries
        self.cannibals = cannibals
        self.boat = boat

    def is_valid(self):
        if self.missionaries < 0 or self.cannibals < 0:
            return False
        if self.missionaries > 3 or self.cannibals > 3:
            return False
        if self.missionaries < self.cannibals and self.missionaries > 0:
            return False
        if 3 - self.missionaries < 3 - self.cannibals and 3 - self.missionaries > 0:
            return False
        return True

    def is_final(self):
        return self.missionaries == 0 and self.cannibals == 0 and self.boat == 0

    def __eq__(self, other):
        return self.missionaries == other.missionaries and self.cannibals == other.cannibals and self.boat == other.boat

    def __hash__(self):
        return hash((self.missionaries, self.cannibals, self.boat))

# Define the depth-first search function
def dfs(state, visited, path):
    if state.is_final():
        return path

    visited.add(state)

    for move in MOVES:
        new_state = State(state.missionaries - move[0] * state.boat,
                          state.cannibals - move[1] * state.boat,
                          1 - state.boat)
        if new_state.is_valid() and new_state not in visited:
            new_path = dfs(new_state, visited, path + [new_state])
            if new_path is not None:
                return new_path

    return None

# Solve the problem
initial_state = State(*INITIAL_STATE)
visited = set()
path = dfs(initial_state, visited, [initial_state])

if path is None:
    print("No solution found")
else:
    print("Solution found:")
    for i, state in enumerate(path):
        print("Step", i, ":")
        print(state.missionaries, "missionaries,", state.cannibals, "cannibals, boat on", "right" if state.boat == 1 else "left")
