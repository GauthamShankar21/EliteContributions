def get_ruler(kingdom):
    ruler = ''
    vowelList = ['a', 'e', 'i', 'o', 'u']
    if kingdom[-1] == 'y':
        ruler = 'nobody'
    elif kingdom[-1] in vowelList:
        ruler = 'Alice'
    else:
        ruler = 'Bob'
    return ruler

def main():
  # Get the number of test cases
  T = int(input())
  for t in range(T):
    # Get the kingdom
    kingdom = input()
    print('Case #%d: %s is ruled by %s.' % (t + 1, kingdom, get_ruler(kingdom.lower())))

if __name__ == '__main__':
  main()

