class Node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None


# Insert into BST
def insert(root, data):
    if not root:
        return Node(data)

    if data < root.data:
        root.left = insert(root.left, data)
    else:
        root.right = insert(root.right, data)

    return root


# Traversals
def inorder(root):
    if root:
        inorder(root.left)
        print(root.data, end=" ")
        inorder(root.right)


def preorder(root):
    if root:
        print(root.data, end=" ")
        preorder(root.left)
        preorder(root.right)


def postorder(root):
    if root:
        postorder(root.left)
        postorder(root.right)
        print(root.data, end=" ")


# Example usage
data = [50, 30, 70, 20, 40, 60, 80]

root = None

for val in data:
    root = insert(root, val)


print("Inorder (sorted):", end=" ")
inorder(root)

print("\nPreorder:", end=" ")
preorder(root)

print("\nPostorder:", end=" ")
postorder(root)
