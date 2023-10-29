#include <iostream>
#include <cstdlib>
#include <string>
#include <stack>
// this question is solved using the <stack> library, which makes easy to carry many operations using stack

using namespace std;

// function declaration 
// the function takes in parameter : string, to check on
// function then checks in for the string for every character & then follows the following logic
bool stringCheck(string str){
	stack <char> s;

	// loop iterates through each character to check whether it is open or close bracket, pushes the open bracket onto stack
	for(int i = 0 ; i < str.length() ; i++){
		
		if(str[i] == '[' || str[i] == '{' || str[i] == '('){
			s.push(str[i]);
		}

		// here it ensured that if close bracket encountered, provided stack is empty, then false check is thrown
		else if(str[i] == ']' || str[i] == '}' || str[i] == ')'){
			if(s.empty()){
				return false;
			}

			// variable top is declared & initialized with s.top() 
			// without this, the compiler throws a segmentation fault, as a result of memory allocation practices
			char top = s.top();
			// if the match occurs then the element is popped from the stack
			s.pop();

			if((str[i] == ']' && top != '[') || (str[i] == '}' && top != '{') || (str[i] == ')' && top != '(')){
				return false;
			}
		}


	}

	return s.empty(); 
}




int main(){

	// taking the user input of paranthesis
	string input;
	cout << "Enter the string with parenthesis: " << endl;
	cin >> input;

	// passing the function with arguements
	if(stringCheck(input)){
		cout << "TRUE " << endl;
	}

	else{
		cout << "FALSE " << endl;
	}

	return 0;
}


// TIME complexity - O(N) (big Oh(N))
// SPACE complexity - O(N) (big Oh(N))
