package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

/* loaded from: classes2.dex */
public class TokenFilter {
    public static final TokenFilter INCLUDE_ALL = new TokenFilter();

    protected TokenFilter() {
    }

    protected boolean _includeScalar() {
        return true;
    }

    public void filterFinishArray() {
    }

    public TokenFilter filterStartArray() {
        return this;
    }

    public TokenFilter filterStartObject() {
        return this;
    }

    public TokenFilter includeElement(int i2) {
        return this;
    }

    public TokenFilter includeProperty(String str) {
        return this;
    }

    public TokenFilter includeRootValue(int i2) {
        return this;
    }

    public boolean includeValue(JsonParser jsonParser) throws IOException {
        return _includeScalar();
    }

    public String toString() {
        return this == INCLUDE_ALL ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }
}
