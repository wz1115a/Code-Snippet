public static void morris(Node head) {
        if (head == null) {
            return;
        }
        Node cur1 = head;
        Node cur2 = null;
        while (cur1 != null) {
            cur2 = cur1.left;
            if (cur2 != null) {  //当前节点存在左孩子时
                while (cur2.right != null && cur2.right != cur1) {  //2找到左子树的最右节点
                    cur2 = cur2.right;
                }
                if (cur2.right == null) {  //2.1最右节点的右指针指向空，即第一次来到节点
                    cur2.right = cur1;
                    cur1 = cur1.left;
                    continue;
                } else {  //2.2最右节点的右指针指向cur1，即第二次来到节点
                    cur2.right = null;
                }
            }
            //System.out.print(cur1.value + " ");
            cur1 = cur1.right;  //1节点向右移动
        }
    }
