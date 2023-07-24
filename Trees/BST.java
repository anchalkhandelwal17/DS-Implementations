package Trees;

public class BST {

    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

        private Node root;

        public BST(){

        }

        public int height(Node node){
            if(node == null){
                return -1;
            }
            return node.height;
        }

        public boolean isEmpty(){
            return root == null;
        }

        public void insert(int value){
            root = insert(root, value);
        }

        private Node insert(Node node, int value){
            if(node == null){
                node = new Node(value);
                return node;
            }

            if(value < node.value){
                node.left = insert(node.left, value);
            }
            if(value > node.value){
                node.right = insert(node.right, value);
            }

            node.height = Math.max(height(node.left), height(node.right) + 1);
            return node;
        }

        public boolean balanced(){
            return balanced(root);
        }
        private boolean balanced(Node node){
            if(node == null){
                return true;
            }
            return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right);
        }

        public void populate(int[] nums){
            for(int i=0; i<nums.length; i++){
                this.insert(nums[i]);
            }
        }
        public void display(){
            display(this.root, "Root Node: ");
        }

        private void display(Node node, String details){
            if(node == null){
                return;
            }

            System.out.println(details + node.value);
            display(node.left, "Left child of " + node.value + " : ");
            display(node.right, "Right child of " + node.value + " : ");
        }

        public static void main(String[] args){
            BST tree = new BST();

            int[] nums = {5,2,7,1,4,6,9,8,3,10};
            tree.populate(nums);
            tree.display();
        }
}
