package com.fasterxml.jackson.databind;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class PropertyMetadata implements Serializable {
    protected final String _defaultValue;
    protected final String _description;
    protected final Integer _index;
    protected final Boolean _required;
    public static final PropertyMetadata STD_REQUIRED = new PropertyMetadata(Boolean.TRUE, null, null, null);
    public static final PropertyMetadata STD_OPTIONAL = new PropertyMetadata(Boolean.FALSE, null, null, null);
    public static final PropertyMetadata STD_REQUIRED_OR_OPTIONAL = new PropertyMetadata(null, null, null, null);

    protected PropertyMetadata(Boolean bool, String str, Integer num, String str2) {
        this._required = bool;
        this._description = str;
        this._index = num;
        this._defaultValue = (str2 == null || str2.isEmpty()) ? null : str2;
    }

    public static PropertyMetadata construct(boolean z, String str, Integer num, String str2) {
        return (str == null && num == null && str2 == null) ? z ? STD_REQUIRED : STD_OPTIONAL : new PropertyMetadata(Boolean.valueOf(z), str, num, str2);
    }

    public boolean isRequired() {
        Boolean bool = this._required;
        return bool != null && bool.booleanValue();
    }

    protected Object readResolve() {
        if (this._description != null || this._index != null || this._defaultValue != null) {
            return this;
        }
        Boolean bool = this._required;
        return bool == null ? STD_REQUIRED_OR_OPTIONAL : bool.booleanValue() ? STD_REQUIRED : STD_OPTIONAL;
    }

    public PropertyMetadata withDescription(String str) {
        return new PropertyMetadata(this._required, str, this._index, this._defaultValue);
    }
}
