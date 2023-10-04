#include<bits/stdc++.h>
using namespace std;

// Definition for singly-linked list.
struct ListNode {
    int val;
    struct ListNode *next;
};

typedef struct ListNode listnode;
 
listnode* listnode_new(int val) {
    listnode* node = (listnode *) malloc(sizeof(listnode));
    node->val = val;
    node->next = NULL;
    return node;
}

void print_list(listnode *h) {
    listnode *temp=h;
    int count=0;
    while(temp) {
        count++;
        cout << temp->val << " ";
        temp=temp->next;
    }
    cout << "\n" << count;
}

/**
 * @input A : Head pointer of linked list 
 * @input B : Integer
 * 
 * @Output head pointer of list.
 */
listnode* solve(listnode* a, int b) {bool flip=1;
    listnode *prev=NULL, *curr=a, *nxt=NULL, *head=NULL;
    
    while(curr) {
        int count=0;
        if(flip) {
            listnode *temp=NULL, *first=NULL;
            
            while(curr && count<b)
            {
                nxt=curr->next;
                if(!first)  first=curr;
                curr->next=temp;
                temp=curr;
                curr=nxt;
                count++;
            }
            
            if(prev) {
                prev->next=temp;
            }
            else{
                head=temp;
            }
            first->next=nxt;
        }
        else {
            int count=0;
            while(curr && count<b) {
                count++;
                prev=curr;
                curr=curr->next;
            }
        }
        flip=(!flip);
    }
    
    return head;
}


void SHINE() {
    int n;
    cin >> n;
    listnode *h=NULL, *ptr; 

    for(int i=0; i<n; i++) {
        int t;
        cin >> t;
        listnode *tn=listnode_new(t);
        if(!h) {
            h=ptr=tn;
            // ptr=h;
        }
        else {
            ptr->next=tn;
            ptr=tn;
        }
    }
    int k;
    cin >> k;

    // print_list(h);

    listnode *ans = solve(h, k);
    print_list(ans);
}

int main() {
    SHINE();
    return 0;
}