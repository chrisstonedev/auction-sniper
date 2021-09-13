package auctionsniper;

import java.util.EventListener;

public interface SniperListener extends EventListener {
    void sniperBidding();

    void sniperLost();
}
