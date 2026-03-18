class Solution(object):
    """
    Calculate max depth of a binary tree.
    """
    def maxDepth(self, root):
        if not root:
            return 0
        
        ldepth = self.maxDepth(root.left)
        rdepth = self.maxDepth(root.right)

        return 1 + max(ldepth, rdepth)