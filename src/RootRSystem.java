public class RootRSystem implements RSystem {

    @Override
    public RSystem getParentSystem() {
        return null;
    }

    @Override
    public Position getPosition() {
        return Position.none();
    }

    @Override
    public Position getAbsolutePosition() {
        return Position.none();
    }
}
