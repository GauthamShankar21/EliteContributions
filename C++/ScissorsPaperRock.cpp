// This is the game of rock, scissors and paper where user have to choos 1 number between the three based on the 3 conditionas and according to the computer selection it is decided that the user wins or lose the game

#include <iostream>  // header files
#include <cstdlib>
#include <ctime>

using namespace std;

int main() {
    // Seed the random number generator
    srand(static_cast<unsigned int>(time(nullptr)));

    // Arrays for the choices
    string choices[] = { "Rock", "Paper", "Scissors" };
    int numChoices = sizeof(choices) / sizeof(choices[0]);

    cout << "Welcome to Rock, Paper, Scissors!" << endl;
    cout << "Choose your move (0 - Rock, 1 - Paper, 2 - Scissors): ";

    int playerChoice;
    cin >> playerChoice;

    // Check for valid input
    if (playerChoice < 0 || playerChoice >= numChoices) {
        cout << "Invalid choice. Please choose 0, 1, or 2." << endl;
        return 1;
    }

    // Generate a random computer choice
    int computerChoice = rand() % numChoices;

    cout << "You chose: " << choices[playerChoice] << endl;
    cout << "Computer chose: " << choices[computerChoice] << endl;

    // Determine the winner
    if (playerChoice == computerChoice) {
        cout << "It's a tie!" << endl;
    } else if ((playerChoice == 0 && computerChoice == 2) ||
               (playerChoice == 1 && computerChoice == 0) ||
               (playerChoice == 2 && computerChoice == 1)) {
        cout << "You win! Congratulations!" << endl;
    } else {
        cout << "Computer wins. Better luck next time!" << endl;
    }

    return 0;
}
