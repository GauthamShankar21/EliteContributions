#include<iostream>
#include<queue>
#include<stack>

using namespace std;

class node{
    public:
        int data;
        node* left;
        node* right;

        node (int d){
            this->data = d;
            this->left = NULL;
            this->right = NULL;
        }
};

node* buildTree(node* root){
    int data;    
    cout << "Enter data: ";
    cin >> data;
    root = new node(data);

    if(data == -1) return NULL;

    cout <<"Enter the data for left of " << data << endl;
    root->left = buildTree(root->left);
    cout <<"Enter the data for right of " << data << endl;
    root->right = buildTree(root->right);

    return root;
}

void levelOrderTraversal(node* root){
    queue <node*> q;
    q.push(root);
    q.push(NULL);

    while(!q.empty()){
        node* temp = q.front();
        q.pop();

        if(temp == NULL) {
            cout <<'\n';
            if(!q.empty()) q.push(NULL);
        } 
        else {
            cout << temp->data << " ";
            if(temp->left) q.push(temp->left);
            if(temp->right) q.push(temp->right);
        }
    }
}

void reverseLevelOrder(node* root){
    queue <node*> q;
    stack <node*> s;
    q.push(root);
    q.push(NULL);

    while(!q.empty()){
        node* temp = q.front();
        q.pop();
        
        if(temp == NULL){
            s.push(NULL);
            if(!q.empty()) 
                q.push(NULL);
        }
        else{
            s.push(temp);
            if(temp->right)
                q.push(temp->right);
            if(temp->left)
                q.push(temp->left);
        }
    }

    while(!s.empty()){
        node* temp = s.top();
        if(temp == NULL) cout << endl;
        else cout << temp->data << " ";
        s.pop();
    }
}

void buildFromLevelOrder(node* &root){
    queue<node*> q;
    int data;
    cout <<"Enter the data of root: ";
    cin >> data;
    node* root = new node(data);
    q.push(root);

    while(!q.empty()){
        node* temp = q.front();
        q.pop();

        int left;
        cout << "Enter left node for " << temp->data <<": ";
        cin >> left;
        if(left != -1){
            temp->left = new node(left);
            q.push(temp->left);
        }

        int right;
        cout << "Enter right node for "<< temp->data <<": ";
        cin >> right;
        if(right!= -1){
            temp->right = new node(right);
            q.push(temp->right);
        }
    }
}

int main()
{
    node* root = NULL;

    buildFromLevelOrder(root);
    //1 3 5 7 11 17 -1 -1 -1 -1 -1 -1 -1
    levelOrderTraversal(root);
    // root = buildTree(root);
    // //1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1

    // cout << "\n Printing Level Order Traversal\n";
    // levelOrderTraversal(root);

    // cout << "\n Printing Reverse Level Order Traversal\n";
    // reverseLevelOrder(root);
}