// Code by Purna Shrestha https://github.com/purnasth

#include <iostream>
#include <string>
#include <vector>
#include <ctime>
#include <cstdlib>

using namespace std;

struct Word {
    string word;
    string hint;
};

vector<Word> wordList = {
    {"python", "A popular programming language"},
    {"java", "Another widely used programming language"},
    {"programming", "The act of writing code"},
    {"hangman", "The name of this game"},
    {"computer", "An electronic device for processing data"},
    {"keyboard", "Input device for computers"},
    {"developer", "Someone who writes software"}
};

Word chooseWord() {
    srand(time(0));
    int randomIndex = rand() % wordList.size();
    return wordList[randomIndex];
}

void playHangman(const string& word, const string& hint) {
    string guessedLetters;
    int attempts = 6;

    cout << "Welcome to Hangman!" << endl;
    cout << "Hint: " << hint << endl;
    cout << "Try to guess the word. You have 6 attempts." << endl;

    while (attempts > 0) {
        string displayWord;
        for (char letter : word) {
            if (guessedLetters.find(letter) != string::npos) {
                displayWord += letter;
            } else {
                displayWord += "_";
            }
        }

        cout << "Word: " << displayWord << endl;
        cout << "Guessed letters: " << guessedLetters << endl;
        cout << "Attempts left: " << attempts << endl;

        char guess;
        cout << "Guess a letter: ";
        cin >> guess;

        if (guessedLetters.find(guess) != string::npos) {
            cout << "You've already guessed that letter." << endl;
        } else if (word.find(guess) != string::npos) {
            guessedLetters += guess;
        } else {
            guessedLetters += guess;
            attempts--;
        }

        if (word.find_first_not_of(guessedLetters) == string::npos) {
            cout << "Congratulations! You guessed the word: " << word << endl;
            break;
        }
    }

    if (attempts == 0) {
        cout << "Out of attempts! The word was '" << word << "'." << endl;
    }
}

int main() {
    Word chosenWord = chooseWord();
    playHangman(chosenWord.word, chosenWord.hint);
    return 0;
}
