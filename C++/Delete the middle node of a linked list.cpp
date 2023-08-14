/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* deleteMiddle(ListNode* head) {
        int n = 0;
        ListNode* x = head;
        while(x!=NULL){
            n++;
            x = x->next;
        }
        if(n==1) return NULL;
        ListNode* slow = head;
        ListNode* fast = head->next;
        int y = n/2;
        while(y>1){
            slow = slow->next;
            fast = fast->next;
            y--;
        }
        slow->next = fast->next;
        fast->next = NULL;
        delete(fast);
        // cout<<n<<endl;
        return head;
    }
};