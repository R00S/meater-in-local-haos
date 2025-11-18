package cm.aptoide.p092pt.editorialList;

/* loaded from: classes.dex */
class EditorialListEvent {
    private final String cardId;
    private final int position;

    public EditorialListEvent(String str, int i2) {
        this.cardId = str;
        this.position = i2;
    }

    public String getCardId() {
        return this.cardId;
    }

    public int getPosition() {
        return this.position;
    }
}
