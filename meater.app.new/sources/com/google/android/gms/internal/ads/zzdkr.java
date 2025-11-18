package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import javax.crypto.KeyAgreement;

/* loaded from: classes2.dex */
public final class zzdkr {
    /* renamed from: a */
    private static BigInteger m19558a(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: b */
    public static KeyPair m19559b(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGeneratorM19569b = zzdkx.f25636h.m19569b("EC");
        keyPairGeneratorM19569b.initialize(eCParameterSpec);
        return keyPairGeneratorM19569b.generateKeyPair();
    }

    /* renamed from: c */
    public static ECPrivateKey m19560c(zzdkt zzdktVar, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) zzdkx.f25637i.m19569b("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), m19562e(zzdktVar)));
    }

    /* renamed from: d */
    public static ECPublicKey m19561d(zzdkt zzdktVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpecM19562e = m19562e(zzdktVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m19565h(eCPoint, eCParameterSpecM19562e.getCurve());
        return (ECPublicKey) zzdkx.f25637i.m19569b("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecM19562e));
    }

    /* renamed from: e */
    public static ECParameterSpec m19562e(zzdkt zzdktVar) throws NoSuchAlgorithmException {
        int i2 = C7018ot.f20213b[zzdktVar.ordinal()];
        if (i2 == 1) {
            return m19563f("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (i2 == 2) {
            return m19563f("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
        }
        if (i2 == 3) {
            return m19563f("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        String strValueOf = String.valueOf(zzdktVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("curve not implemented:");
        sb.append(strValueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    /* renamed from: f */
    private static ECParameterSpec m19563f(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    /* renamed from: g */
    static void m19564g(ECPublicKey eCPublicKey) throws GeneralSecurityException {
        m19565h(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    /* renamed from: h */
    static void m19565h(ECPoint eCPoint, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerM19558a = m19558a(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        }
        if (affineX.signum() == -1 || affineX.compareTo(bigIntegerM19558a) != -1) {
            throw new GeneralSecurityException("x is out of range");
        }
        if (affineY.signum() == -1 || affineY.compareTo(bigIntegerM19558a) != -1) {
            throw new GeneralSecurityException("y is out of range");
        }
        if (!affineY.multiply(affineY).mod(bigIntegerM19558a).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(bigIntegerM19558a))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* renamed from: i */
    public static byte[] m19566i(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws IllegalStateException, GeneralSecurityException {
        m19565h(eCPoint, eCPrivateKey.getParams().getCurve());
        ECParameterSpec params = eCPrivateKey.getParams();
        params.getCurve();
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, params));
        KeyAgreement keyAgreementM19569b = zzdkx.f25635g.m19569b("ECDH");
        keyAgreementM19569b.init(eCPrivateKey);
        try {
            keyAgreementM19569b.doPhase(publicKeyGeneratePublic, true);
            byte[] bArrGenerateSecret = keyAgreementM19569b.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(m19558a(curve)) != -1) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger bigIntegerM19558a = m19558a(curve);
            BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(curve.getA()).multiply(bigInteger).add(curve.getB()).mod(bigIntegerM19558a);
            if (bigIntegerM19558a.signum() != 1) {
                throw new InvalidAlgorithmParameterException("p must be positive");
            }
            BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerM19558a);
            BigInteger bigIntegerAdd = null;
            BigInteger bigInteger2 = BigInteger.ZERO;
            if (!bigIntegerMod2.equals(bigInteger2)) {
                if (bigIntegerM19558a.testBit(0) && bigIntegerM19558a.testBit(1)) {
                    bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerM19558a.add(BigInteger.ONE).shiftRight(2), bigIntegerM19558a);
                } else if (bigIntegerM19558a.testBit(0) && !bigIntegerM19558a.testBit(1)) {
                    bigIntegerAdd = BigInteger.ONE;
                    BigInteger bigIntegerShiftRight = bigIntegerM19558a.subtract(bigIntegerAdd).shiftRight(1);
                    int i2 = 0;
                    while (true) {
                        BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerM19558a);
                        if (bigIntegerMod3.equals(BigInteger.ZERO)) {
                            break;
                        }
                        BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerM19558a);
                        BigInteger bigIntegerMod4 = BigInteger.ONE;
                        if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerM19558a)) {
                            BigInteger bigIntegerShiftRight2 = bigIntegerM19558a.add(bigIntegerMod4).shiftRight(1);
                            BigInteger bigIntegerMod5 = bigIntegerAdd;
                            for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                                bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerM19558a).multiply(bigIntegerMod3)).mod(bigIntegerM19558a);
                                BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerM19558a);
                                if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                    BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerM19558a);
                                    bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerM19558a);
                                    bigIntegerMod5 = bigIntegerMod7;
                                } else {
                                    bigIntegerMod4 = bigIntegerMod6;
                                }
                            }
                            bigIntegerAdd = bigIntegerMod5;
                        } else {
                            if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                            i2++;
                            if (i2 == 128 && !bigIntegerM19558a.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                }
                if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerM19558a).compareTo(bigIntegerMod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
                bigInteger2 = bigIntegerAdd;
            }
            if (true != bigInteger2.testBit(0)) {
                bigIntegerM19558a.subtract(bigInteger2).mod(bigIntegerM19558a);
            }
            return bArrGenerateSecret;
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
    }

    /* renamed from: j */
    public static int m19567j(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (m19558a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }
}
