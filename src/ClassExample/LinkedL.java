package ClassExample;

//public class LinkedL {
//
//        static LinkedL head;
//
//        static class LinkedL{
//            int val;
//            LinkedL next;
//
//            // constructor
//            LinkedL(int no)
//            {
//                val = no;
//                next = null;
//            }
//        }
//        LinkedL reverse(LinkedL node)
//        {
//
//            LinkedL previous = null;
//            LinkedL current = node;
//            LinkedL next = null;
//
//
//            while (current != null)
//            {
//                next = current.next;
//                current.next = previous;
//                previous = current;
//                current = next;
//            }
//            node = previous;
//            return node;
//        }
//
//        // displays
//        void printList(LinkedL node)
//        {
//            while (node != null)
//            {
//                System.out.print(node.val + " ");
//                node = node.next;
//            }
//        }
//
//        public static void main(String argvs[])
//        {
//            LinkedL listObj = new LinkedL();
//
//            listObj.head = new LinkedL(4);
//
//            listObj.head.next = new LinkedL(6);
//
//            listObj.head.next.next = new LinkedL(7);
//
//            listObj.head.next.next.next = new LinkedL(1);
//
//            listObj.head.next.next.next.next = new LinkedL(5);
//
//            listObj.head.next.next.next.next.next = new LinkedL(8);
//
//            listObj.head.next.next.next.next.next.next = new LinkedL(3);
//
//            listObj.head.next.next.next.next.next.next.next = new LinkedL(2);
//
//
//            System.out.println("The Linked list before reversal is: ");
//            listObj.printList(head);
//            head = listObj.reverse(head);
//            System.out.println(" ");
//            System.out.println("After reversal, the linked list is: ");
//            listObj.printList(head);
//        }
//    }
//}
