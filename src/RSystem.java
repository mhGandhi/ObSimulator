public interface RSystem {

    /**
     * Returns the Parent-System
     *
     * @return Parent
     */
    RSystem getParentSystem();

    /**
     * Returns the Systems Position relative to Parent
     * @return pos
     */
    Position getPosition();

    /**
     * Returns the Systems absolute Position (relative to root)
     * @return
     */
    Position getAbsolutePosition();
}
