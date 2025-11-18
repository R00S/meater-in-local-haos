package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface JsonInclude {

    public enum Include {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        USE_DEFAULTS
    }

    /* loaded from: classes2.dex */
    public static class Value implements Serializable {
        protected static final Value EMPTY;
        protected final Include _contentInclusion;
        protected final Include _valueInclusion;

        static {
            Include include = Include.USE_DEFAULTS;
            EMPTY = new Value(include, include);
        }

        protected Value(Include include, Include include2) {
            this._valueInclusion = include == null ? Include.USE_DEFAULTS : include;
            this._contentInclusion = include2 == null ? Include.USE_DEFAULTS : include2;
        }

        public static Value construct(Include include, Include include2) {
            Include include3 = Include.USE_DEFAULTS;
            return ((include == include3 || include == null) && (include2 == include3 || include2 == null)) ? EMPTY : new Value(include, include2);
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != Value.class) {
                return false;
            }
            Value value = (Value) obj;
            return value._valueInclusion == this._valueInclusion && value._contentInclusion == this._contentInclusion;
        }

        public Include getContentInclusion() {
            return this._contentInclusion;
        }

        public Include getValueInclusion() {
            return this._valueInclusion;
        }

        public int hashCode() {
            return (this._valueInclusion.hashCode() << 2) + this._contentInclusion.hashCode();
        }

        protected Object readResolve() {
            Include include = this._valueInclusion;
            Include include2 = Include.USE_DEFAULTS;
            return (include == include2 && this._contentInclusion == include2) ? EMPTY : this;
        }

        public String toString() {
            return String.format("[value=%s,content=%s]", this._valueInclusion, this._contentInclusion);
        }

        public Value withOverrides(Value value) {
            if (value != null && value != EMPTY) {
                Include include = value._valueInclusion;
                Include include2 = value._contentInclusion;
                Include include3 = this._valueInclusion;
                boolean z = (include == include3 || include == Include.USE_DEFAULTS) ? false : true;
                Include include4 = this._contentInclusion;
                boolean z2 = (include2 == include4 || include2 == Include.USE_DEFAULTS) ? false : true;
                if (z) {
                    return z2 ? new Value(include, include2) : new Value(include, include4);
                }
                if (z2) {
                    return new Value(include3, include2);
                }
            }
            return this;
        }
    }

    Include content() default Include.ALWAYS;

    Include value() default Include.ALWAYS;
}
