package buildmoudle;

/**
 * Created by Administrator on 2017/6/9.
 */
public abstract class Builder {
    public abstract Builder builderBoard(String Board);
    public abstract Builder builderDisplay(String Display);
    public abstract Builder builderOS();
    public abstract Computer create();
}
