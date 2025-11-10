package com.apptionlabs.meater_app.data;

import gg.c;

/* loaded from: /tmp/meat/meat/classes.dex */
public class UserOfferData {

    @c("numberOfAvailableOffers")
    @gg.a
    public int availableOffers;

    @c("numberOfNewOffers")
    @gg.a
    public int newOffers;

    @c("offersUrl")
    @gg.a
    public String offersUrl;

    @c("signedUpToNewsletter")
    @gg.a
    public boolean signedUpToNewsletter;
    public String email = "";
    public OfferBasePairDevices pairedDevices = new OfferBasePairDevices();
    public UserDevice device = new UserDevice();
}
