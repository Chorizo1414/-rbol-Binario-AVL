
package árboles.avl.umg;



class AVLNode {
    int val, height;
    AVLNode left, right;
    public AVLNode(int val) {
        this.val = val;
        height = 1;
    }
}

class AVLTree {
    AVLNode root;
    
    // Función para obtener la altura de un nodo
    int height(AVLNode node) {
        if (node == null) return 0;
        return node.height;
    }
    
    // Función para obtener el factor de equilibrio de un nodo
    int getBalance(AVLNode node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }
    
    // Función para rotar a la derecha un subárbol
    AVLNode rightRotate(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }
    
    // Función para rotar a la izquierda un subárbol
    AVLNode leftRotate(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }
    
    // Función para insertar un nodo en el árbol
    AVLNode insert(AVLNode node, int val) {
        if (node == null) return new AVLNode(val);
        if (val < node.val) node.left = insert(node.left, val);
        else if (val > node.val) node.right = insert(node.right, val);
        else return node;
        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);
        if (balance > 1 && val < node.left.val) return rightRotate(node);
        if (balance < -1 && val > node.right.val) return leftRotate(node);
        if (balance > 1 && val > node.left.val) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        if (balance < -1 && val < node.right.val) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }
    
    // Función para imprimir en orden el árbol
    void inorder(AVLNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }
}


public class ÁrbolesAVLUMG {


    public static void main(String[] args) {
        
        AVLTree tree = new AVLTree();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
        System.out.println("Arbol AVL construido: ");
        tree.inorder(tree.root);
        

    }
    
}

