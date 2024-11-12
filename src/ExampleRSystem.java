public class ExampleRSystem implements RSystem {

    private final RSystem parentRSystem;
    private Position position;

    public ExampleRSystem(RSystem pParent){
        this(pParent,new Position());
    }
    public ExampleRSystem(RSystem pParent, Position pPos){
        this.parentRSystem = pParent;
        this.position = pPos;
    }

    @Override
    public RSystem getParentSystem() {
        return this.parentRSystem;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public Position getAbsolutePosition() {
        return this.position.added(getParentSystem().getPosition());
    }
}
