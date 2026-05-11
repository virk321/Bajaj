class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

public class diameter{
        static int dia = 0;
        public static int height(Node root) {

            if(root == null) {
                return 0;
            }

            int left = height(root.left);
            int right = height(root.right);

            dia = Math.max(dia, left + right);

            return 1 + Math.max(left, right);
        }

        public static int diameterOfBinaryTree(Node root) {

            height(root);

            return dia;
        }

        public static void main(String[] args) {

            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            System.out.println(diameterOfBinaryTree(root));
        }
}
