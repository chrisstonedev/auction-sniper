package auctionsniper;

public record AuctionSniper(Auction auction, SniperListener sniperListener) implements AuctionEventListener {
    public void currentPrice(int price, int increment) {
        auction.bid(price + increment);
        sniperListener.sniperBidding();
    }

    public void auctionClosed() {
        sniperListener.sniperLost();
    }
}
