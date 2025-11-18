package c0;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.M;
import oa.v;

/* compiled from: AndroidAutofillType.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\"6\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001e\u0010\f\u001a\u00020\u0002*\u00020\u00018@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0004\u0010\t¨\u0006\r"}, d2 = {"Ljava/util/HashMap;", "Lc0/j;", "", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "getAndroidAutofillTypes$annotations", "()V", "androidAutofillTypes", "(Lc0/j;)Ljava/lang/String;", "getAndroidType$annotations", "(Lc0/j;)V", "androidType", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<j, String> f30822a = M.j(v.a(j.EmailAddress, "emailAddress"), v.a(j.Username, "username"), v.a(j.Password, "password"), v.a(j.NewUsername, "newUsername"), v.a(j.NewPassword, "newPassword"), v.a(j.PostalAddress, "postalAddress"), v.a(j.PostalCode, "postalCode"), v.a(j.CreditCardNumber, "creditCardNumber"), v.a(j.CreditCardSecurityCode, "creditCardSecurityCode"), v.a(j.CreditCardExpirationDate, "creditCardExpirationDate"), v.a(j.CreditCardExpirationMonth, "creditCardExpirationMonth"), v.a(j.CreditCardExpirationYear, "creditCardExpirationYear"), v.a(j.CreditCardExpirationDay, "creditCardExpirationDay"), v.a(j.AddressCountry, "addressCountry"), v.a(j.AddressRegion, "addressRegion"), v.a(j.AddressLocality, "addressLocality"), v.a(j.AddressStreet, "streetAddress"), v.a(j.AddressAuxiliaryDetails, "extendedAddress"), v.a(j.PostalCodeExtended, "extendedPostalCode"), v.a(j.PersonFullName, "personName"), v.a(j.PersonFirstName, "personGivenName"), v.a(j.PersonLastName, "personFamilyName"), v.a(j.PersonMiddleName, "personMiddleName"), v.a(j.PersonMiddleInitial, "personMiddleInitial"), v.a(j.PersonNamePrefix, "personNamePrefix"), v.a(j.PersonNameSuffix, "personNameSuffix"), v.a(j.PhoneNumber, "phoneNumber"), v.a(j.PhoneNumberDevice, "phoneNumberDevice"), v.a(j.PhoneCountryCode, "phoneCountryCode"), v.a(j.PhoneNumberNational, "phoneNational"), v.a(j.Gender, "gender"), v.a(j.BirthDateFull, "birthDateFull"), v.a(j.BirthDateDay, "birthDateDay"), v.a(j.BirthDateMonth, "birthDateMonth"), v.a(j.BirthDateYear, "birthDateYear"), v.a(j.SmsOtpCode, "smsOTPCode"));

    public static final String a(j jVar) {
        String str = f30822a.get(jVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type");
    }
}
