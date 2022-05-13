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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2)
    {
//      ListNode* add=new ListNode();
//         int sum=0, carry=0;
//        while(l1&&l2)
//      {
//        sum+=l1->val+l2->val+carry;
//        carry=sum/10;
//        l1=l1->next;
//     l2=l2->next;
           
//        }
//   
        ListNode* head = NULL;
        ListNode* newHead = NULL;
        int carry=0;
        
        while((l1!=NULL) && (l2!=NULL))
        {
            int curr = (l1->val)+(l2->val)+carry;
            int temp = (curr)%10;
            if(head == NULL)
            {
                head = new ListNode(temp);
                newHead = head;
            }
            else
            {
                ListNode* temp1 = new ListNode(temp);
                newHead->next = temp1;
                newHead=newHead->next;
            }
            carry = (curr)/10;
            l1 = l1->next;
            l2 = l2->next;
        }
        
             while(l1!=NULL)
            {
                int curr = (l1->val)+carry;
                int temp = curr%10;
                ListNode* temp1 = new ListNode(temp);
                newHead->next = temp1;
                newHead=newHead->next;
                carry=(curr)/10;  
                l1 = l1->next;
            }
        
            while(l2!=NULL)
            {
                 int curr = (l2->val)+carry;
                int temp = curr%10;
                ListNode* temp1 = new ListNode(temp);
                newHead->next = temp1;
                  newHead=newHead->next;
                carry=(curr)/10;
                l2 = l2->next;
            }
        
        if(carry!=0)
        {
            ListNode* temp1 = new ListNode(carry);
            newHead->next = temp1;
        }
        
        return head;
        
    }
};