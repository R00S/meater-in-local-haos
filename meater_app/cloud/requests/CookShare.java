package com.apptionlabs.meater_app.cloud.requests;

import gg.a;
import gg.c;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CookShare {

    @c("cookId")
    @a
    public String cookId;

    @c("email")
    @a
    public String email;

    @c("errorCode")
    @a
    public int errorCode;

    @c("facebook_token")
    @a
    public String facebookToken;

    @c("google_token")
    @a
    public String googleToken;

    @c("password")
    @a
    public String password;

    @c("status")
    @a
    public boolean status;

    @c("temperature_scale")
    @a
    private String temperatureScale;

    @c("url")
    @a
    public String url;

    public String getCookId() {
        return this.cookId;
    }

    public String getEmail() {
        return this.email;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getFacebookToken() {
        return this.facebookToken;
    }

    public String getGoogleToken() {
        return this.googleToken;
    }

    public String getPassword() {
        return this.password;
    }

    public String getTemperatureScale() {
        return this.temperatureScale;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setCookId(String str) {
        this.cookId = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setErrorCode(int i10) {
        this.errorCode = i10;
    }

    public void setFacebookToken(String str) {
        this.facebookToken = str;
    }

    public void setGoogleToken(String str) {
        this.googleToken = str;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setStatus(boolean z10) {
        this.status = z10;
    }

    public void setTemperatureScale(String str) {
        this.temperatureScale = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
