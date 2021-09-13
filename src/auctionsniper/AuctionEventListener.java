package auctionsniper;

public interface AuctionEventListener {
    void currentPrice(int price, int increment);

    void auctionClosed();
}
