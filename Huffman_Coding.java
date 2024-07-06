public class Huffman_Coding {
     static class Node {
          char character;
          int frequency;
          Node left, right;

          public Node(char character, int frequency) {
               this.character = character;
               this.frequency = frequency;
               this.left = this.right = null;
          }
     }

     public static void main(String[] args) {
          char[] characters = {'a', 'b', 'c', 'd', 'e', 'f'};
          int[] frequencies = {5, 9, 12, 13, 16, 45};

          Node root = buildTree(characters, frequencies);
          printCodes(root, "");
     }

     private static Node buildTree(char[] characters, int[] frequencies) {
          Node[] nodes = new Node[characters.length];
          for (int i = 0; i < characters.length; i++) {
               nodes[i] = new Node(characters[i], frequencies[i]);
          }

          while (nodes.length > 1) {
               Node left = nodes[0];
               Node right = nodes[1];
               Node parent = new Node('\0', left.frequency + right.frequency);
               parent.left = left;
               parent.right = right;
               nodes[0] = parent;
               nodes[1] = nodes[nodes.length - 1];
               nodes = removeNode(nodes, nodes.length - 1);
          }

          return nodes[0];
     }

     private static Node[] removeNode(Node[] nodes, int index) {
          Node[] newNode = new Node[nodes.length - 1];
          for (int i = 0, j = 0; i < nodes.length; i++) {
               if (i != index) {
                    newNode[j++] = nodes[i];
               }
          }
          return newNode;
     }

     private static void printCodes(Node root, String code) {
          if (root == null) {
               return;
          }

          if (root.character != '\0') {
               System.out.println(root.character + ": " + code);
          }
          printCodes(root.left, code + "0");
          printCodes(root.right, code + "1");
     }
}