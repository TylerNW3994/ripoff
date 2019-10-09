package events;

/**
 * A simple register listener interface.
 * @author tnwallsc
 */
public interface ListenerInterface {

    public void messageReceived(RipoffEvent event);

}
