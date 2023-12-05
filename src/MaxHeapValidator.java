/**
 * Verify that a before tree, an integer element, and an after tree,
 * and that the after tree is a valid result for both add and remove operations.
 */
public class MaxHeapValidator implements BTValidator{

    /**
     * Check if adding i to the old tree and getting the new tree is possible with the current invariants
     *
     * @param oldTree the given tree we assume respects the invariants
     * @param i       the element to add
     * @param newTree the new tree which we are validating
     * @return true if we determine that the new tree respects the invariants
     */
    @Override
    public boolean validAdd(IBinTree oldTree, int i, IBinTree newTree) {
        return false;
    }

    /**
     * Check if removing i from the old tree and getting the new tree is possible with the current invariants
     *
     * @param oldTree the given tree we assume respects the invariants
     * @param i       the element to remove
     * @param newTree the new tree which we are validating
     * @return true if we determine that the new tree respects the invariants
     */
    @Override
    public boolean validRemove(IBinTree oldTree, int i, IBinTree newTree) {
        return false;
    }
}
