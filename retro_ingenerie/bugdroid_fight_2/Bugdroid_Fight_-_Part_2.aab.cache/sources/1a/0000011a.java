package L0;

import A.g;
import A.h;
import A.i;
import I.AbstractC0009d;
import I.F;
import I.G;
import I.H;
import I.InterfaceC0020i0;
import I.J;
import I.M;
import I.X;
import I.Y;
import M.o;
import M.s;
import M.t;
import X0.n;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0108t;
import b0.AbstractC0120D;
import b0.AbstractC0142u;
import b0.C0124b;
import b0.C0129g;
import b0.C0145x;
import b0.K;
import b0.L;
import b1.l;
import c.C0151d;
import com.example.reverseexample.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d.AbstractC0156a;
import g.C0175M;
import h0.AbstractC0205B;
import h0.AbstractC0217N;
import h0.b0;
import i.C0262h;
import i0.InterfaceC0277f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import k.A1;
import k.C0358s;
import k.C1;
import k.W0;
import k0.AbstractC0374a;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import r.C0424c;
import r.C0425d;
import r.j;
import s.C0443o;
import w.AbstractC0465b;
import w.C0468e;
import x.AbstractC0475a;
import y.AbstractC0482b;
import y.AbstractC0483c;
import z.AbstractC0488c;
import z.AbstractC0489d;

/* loaded from: base/dex/classes.dex */
public abstract class c implements InterfaceC0020i0 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f651a = false;

    /* renamed from: b  reason: collision with root package name */
    public static Method f652b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f653c = false;

    /* renamed from: d  reason: collision with root package name */
    public static Field f654d = null;

    /* renamed from: e  reason: collision with root package name */
    public static long f655e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static Method f656f = null;

    /* renamed from: g  reason: collision with root package name */
    public static Field f657g = null;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f658h = false;

    /* renamed from: i  reason: collision with root package name */
    public static Class f659i = null;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f660j = false;

    /* renamed from: k  reason: collision with root package name */
    public static Field f661k = null;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f662l = false;

    /* renamed from: m  reason: collision with root package name */
    public static Field f663m = null;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f664n = false;

    /* renamed from: o  reason: collision with root package name */
    public static boolean f665o = true;

    public static O0.e A() {
        return new O0.e(R.xml.backup_rules);
    }

    public static String B(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = c.class.getName();
        int i2 = R.xml.backup_rules;
        while (!stackTrace[i2].getClassName().equals(name)) {
            i2 += R.xml.data_extraction_rules;
        }
        while (stackTrace[i2].getClassName().equals(name)) {
            i2 += R.xml.data_extraction_rules;
        }
        StackTraceElement stackTraceElement = stackTrace[i2];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static final List B0(List list) {
        int size = list.size();
        if (size != 0) {
            if (size == R.xml.data_extraction_rules) {
                return j0(list.get(R.xml.backup_rules));
            }
            return list;
        }
        return n.f1579a;
    }

    public static boolean C(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z2 = R.xml.data_extraction_rules;
            for (int i2 = R.xml.backup_rules; i2 < length; i2 += R.xml.data_extraction_rules) {
                if (C(listFiles[i2]) && z2) {
                    z2 = R.xml.data_extraction_rules;
                } else {
                    z2 = R.xml.backup_rules;
                }
            }
            return z2;
        }
        file.delete();
        return true;
    }

    public static A.f C0(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        boolean z2;
        int i3;
        do {
            next = xmlResourceParser.next();
            if (next == R.styleable.ActionMenuItemView) {
                break;
            }
        } while (next != R.xml.data_extraction_rules);
        if (next == R.styleable.ActionMenuItemView) {
            xmlResourceParser.require(R.styleable.ActionMenuItemView, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0475a.f5291b);
                String string = obtainAttributes.getString(R.xml.backup_rules);
                String string2 = obtainAttributes.getString(R.styleable.ActionMode);
                String string3 = obtainAttributes.getString(R.styleable.ActivityChooserView);
                int resourceId = obtainAttributes.getResourceId(R.xml.data_extraction_rules, R.xml.backup_rules);
                int integer = obtainAttributes.getInteger(R.styleable.ActionMenuItemView, R.xml.data_extraction_rules);
                int integer2 = obtainAttributes.getInteger(R.styleable.ActionMenuView, 500);
                String string4 = obtainAttributes.getString(R.styleable.ActivityFilter);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != R.styleable.ActionMenuView) {
                        b1(xmlResourceParser);
                    }
                    return new i(new C0358s(string, string2, string3, I0(resourceId, resources)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != R.styleable.ActionMenuView) {
                    if (xmlResourceParser.getEventType() == R.styleable.ActionMenuItemView) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0475a.f5292c);
                            int i4 = R.styleable.ActivityRule;
                            if (!obtainAttributes2.hasValue(R.styleable.ActivityRule)) {
                                i4 = R.xml.data_extraction_rules;
                            }
                            int i5 = obtainAttributes2.getInt(i4, 400);
                            if (obtainAttributes2.hasValue(R.styleable.ActivityFilter)) {
                                i2 = R.styleable.ActivityFilter;
                            } else {
                                i2 = R.styleable.ActionMenuItemView;
                            }
                            if (R.xml.data_extraction_rules == obtainAttributes2.getInt(i2, R.xml.backup_rules)) {
                                z2 = R.xml.data_extraction_rules;
                            } else {
                                z2 = R.xml.backup_rules;
                            }
                            int i6 = R.styleable.AlertDialog;
                            if (!obtainAttributes2.hasValue(R.styleable.AlertDialog)) {
                                i6 = R.styleable.ActionMenuView;
                            }
                            int i7 = R.styleable.ActivityNavigator;
                            if (!obtainAttributes2.hasValue(R.styleable.ActivityNavigator)) {
                                i7 = R.styleable.ActionMode;
                            }
                            String string5 = obtainAttributes2.getString(i7);
                            int i8 = obtainAttributes2.getInt(i6, R.xml.backup_rules);
                            if (obtainAttributes2.hasValue(R.styleable.ActivityChooserView)) {
                                i3 = R.styleable.ActivityChooserView;
                            } else {
                                i3 = R.xml.backup_rules;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i3, R.xml.backup_rules);
                            String string6 = obtainAttributes2.getString(i3);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != R.styleable.ActionMenuView) {
                                b1(xmlResourceParser);
                            }
                            arrayList.add(new h(i5, i8, resourceId2, string6, string5, z2));
                        } else {
                            b1(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new g((h[]) arrayList.toArray(new h[R.xml.backup_rules]));
                }
            } else {
                b1(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [I.X, java.lang.Object] */
    public static boolean D(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = Y.f505a;
        if (Build.VERSION.SDK_INT >= R.styleable.Capability) {
            return false;
        }
        ArrayList arrayList2 = X.f501d;
        X x2 = (X) view.getTag(2131231178);
        X x3 = x2;
        if (x2 == null) {
            ?? obj = new Object();
            obj.f502a = null;
            obj.f503b = null;
            obj.f504c = null;
            view.setTag(2131231178, obj);
            x3 = obj;
        }
        WeakReference weakReference2 = x3.f504c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        x3.f504c = new WeakReference(keyEvent);
        if (x3.f503b == null) {
            x3.f503b = new SparseArray();
        }
        SparseArray sparseArray = x3.f503b;
        if (keyEvent.getAction() == R.xml.data_extraction_rules && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        } else {
            weakReference = null;
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !J.b(view2) || (arrayList = (ArrayList) view2.getTag(2131231179)) == null || (size = arrayList.size() - R.xml.data_extraction_rules) < 0) {
            return true;
        }
        b.e(arrayList.get(size));
        throw null;
    }

    public static PorterDuff.Mode D0(int i2, PorterDuff.Mode mode) {
        if (i2 != R.styleable.ActionMenuView) {
            if (i2 != R.styleable.ActivityChooserView) {
                if (i2 != R.styleable.AlertDialog) {
                    switch (i2) {
                        case R.styleable.AppBarLayoutStates /* 14 */:
                            return PorterDuff.Mode.MULTIPLY;
                        case R.styleable.AppBarLayout_Layout /* 15 */:
                            return PorterDuff.Mode.SCREEN;
                        case R.styleable.AppCompatEmojiHelper /* 16 */:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean E(I.InterfaceC0027m r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.e(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L81
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L64
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L64
            if (r8 == 0) goto L64
            boolean r1 = L0.c.f651a
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r0 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            L0.c.f652b = r0     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            L0.c.f651a = r3
        L4c:
            java.lang.reflect.Method r0 = L0.c.f652b
            if (r0 == 0) goto L64
            java.lang.Object[] r1 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L64
            java.lang.Object r8 = r0.invoke(r8, r1)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto L5b
            goto L64
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L64
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L64
            goto L80
        L64:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6b
            goto L80
        L6b:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = I.Y.c(r7, r10)
            if (r8 == 0) goto L76
            goto L80
        L76:
            if (r7 == 0) goto L7c
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7c:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L80:
            return r3
        L81:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld4
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = L0.c.f653c
            if (r7 != 0) goto L9a
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L98
            L0.c.f654d = r7     // Catch: java.lang.NoSuchFieldException -> L98
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L98
        L98:
            L0.c.f653c = r3
        L9a:
            java.lang.reflect.Field r7 = L0.c.f654d
            if (r7 == 0) goto La5
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La5
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La5
            goto La6
        La5:
            r7 = r2
        La6:
            if (r7 == 0) goto Lb3
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb3
            goto Ld3
        Lb3:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbe
            goto Ld3
        Lbe:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = I.Y.c(r7, r10)
            if (r8 == 0) goto Lc9
            goto Ld3
        Lc9:
            if (r7 == 0) goto Lcf
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lcf:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld3:
            return r3
        Ld4:
            if (r8 == 0) goto Ldc
            boolean r8 = I.Y.c(r8, r10)
            if (r8 != 0) goto Le2
        Ldc:
            boolean r7 = r7.e(r10)
            if (r7 == 0) goto Le3
        Le2:
            r0 = r3
        Le3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.E(I.m, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static void E0(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", R.xml.backup_rules);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e2);
                    if (openFileOutput == null) {
                        return;
                    }
                }
                try {
                    openFileOutput.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    public static final BottomSheetBehavior F(View view) {
        o("view", view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0468e)) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return null;
            }
            return F((View) parent);
        }
        AbstractC0465b abstractC0465b = ((C0468e) layoutParams).f5261a;
        if (!(abstractC0465b instanceof BottomSheetBehavior)) {
            return null;
        }
        return (BottomSheetBehavior) abstractC0465b;
    }

    public static void F0(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = R.xml.backup_rules; i2 < size; i2 += R.xml.data_extraction_rules) {
            Animator animator = (Animator) arrayList.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(R.xml.backup_rules, R.xml.backup_rules);
        ofInt.setDuration(j2);
        arrayList.add(R.xml.backup_rules, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static View G(View view, int i2) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = R.xml.backup_rules; i3 < childCount; i3 += R.xml.data_extraction_rules) {
            View findViewById = viewGroup.getChildAt(i3).findViewById(i2);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T.c, T.b] */
    public static T.b G0(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        C0175M c0175m = new C0175M(duplicate);
        c0175m.B(R.styleable.ActionMode);
        int i2 = ((ByteBuffer) c0175m.f3192b).getShort() & 65535;
        if (i2 <= R.styleable.MenuItem) {
            c0175m.B(R.styleable.ActivityFilter);
            int i3 = R.xml.backup_rules;
            while (true) {
                if (i3 < i2) {
                    int i4 = ((ByteBuffer) c0175m.f3192b).getInt();
                    c0175m.B(R.styleable.ActionMode);
                    j2 = c0175m.A();
                    c0175m.B(R.styleable.ActionMode);
                    if (1835365473 == i4) {
                        break;
                    }
                    i3 += R.xml.data_extraction_rules;
                } else {
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                c0175m.B((int) (j2 - ((ByteBuffer) c0175m.f3192b).position()));
                c0175m.B(R.styleable.AnimatedStateListDrawableTransition);
                long A2 = c0175m.A();
                for (int i5 = R.xml.backup_rules; i5 < A2; i5 += R.xml.data_extraction_rules) {
                    int i6 = ((ByteBuffer) c0175m.f3192b).getInt();
                    long A3 = c0175m.A();
                    c0175m.A();
                    if (1164798569 == i6 || 1701669481 == i6) {
                        duplicate.position((int) (A3 + j2));
                        ?? cVar = new T.c();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        cVar.f1189b = duplicate;
                        cVar.f1188a = position;
                        int i7 = position - duplicate.getInt(position);
                        cVar.f1190c = i7;
                        cVar.f1191d = cVar.f1189b.getShort(i7);
                        return cVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [s.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static C0443o H(C0425d c0425d, int i2, ArrayList arrayList, C0443o c0443o) {
        int i3;
        C0424c c0424c;
        int i4;
        if (i2 == 0) {
            i3 = c0425d.f4787n0;
        } else {
            i3 = c0425d.f4789o0;
        }
        int i5 = R.xml.backup_rules;
        if (i3 != -1 && (c0443o == 0 || i3 != c0443o.f4940b)) {
            int i6 = R.xml.backup_rules;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                C0443o c0443o2 = (C0443o) arrayList.get(i6);
                if (c0443o2.f4940b == i3) {
                    if (c0443o != 0) {
                        c0443o.c(i2, c0443o2);
                        arrayList.remove(c0443o);
                    }
                    c0443o = c0443o2;
                } else {
                    i6 += R.xml.data_extraction_rules;
                }
            }
        } else if (i3 != -1) {
            return c0443o;
        }
        C0443o c0443o3 = c0443o;
        if (c0443o == null) {
            if (c0425d instanceof j) {
                j jVar = (j) c0425d;
                int i7 = R.xml.backup_rules;
                while (true) {
                    if (i7 < jVar.f4884r0) {
                        C0425d c0425d2 = jVar.f4883q0[i7];
                        if ((i2 == 0 && (i4 = c0425d2.f4787n0) != -1) || (i2 == R.xml.data_extraction_rules && (i4 = c0425d2.f4789o0) != -1)) {
                            break;
                        }
                        i7 += R.xml.data_extraction_rules;
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                if (i4 != -1) {
                    int i8 = R.xml.backup_rules;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        }
                        C0443o c0443o4 = (C0443o) arrayList.get(i8);
                        if (c0443o4.f4940b == i4) {
                            c0443o = c0443o4;
                            break;
                        }
                        i8 += R.xml.data_extraction_rules;
                    }
                }
            }
            if (c0443o == 0) {
                c0443o = new Object();
                c0443o.f4939a = new ArrayList();
                c0443o.f4942d = null;
                c0443o.f4943e = -1;
                int i9 = C0443o.f4938f;
                C0443o.f4938f = i9 + R.xml.data_extraction_rules;
                c0443o.f4940b = i9;
                c0443o.f4941c = i2;
            }
            arrayList.add(c0443o);
            c0443o3 = c0443o;
        }
        ArrayList arrayList2 = c0443o3.f4939a;
        if (!arrayList2.contains(c0425d)) {
            arrayList2.add(c0425d);
            if (c0425d instanceof r.h) {
                r.h hVar = (r.h) c0425d;
                C0424c c0424c2 = hVar.f4880t0;
                if (hVar.f4881u0 == 0) {
                    i5 = R.xml.data_extraction_rules;
                }
                c0424c2.c(i5, c0443o3, arrayList);
            }
            int i10 = c0443o3.f4940b;
            if (i2 == 0) {
                c0425d.f4787n0 = i10;
                c0425d.f4742I.c(i2, c0443o3, arrayList);
                c0424c = c0425d.f4744K;
            } else {
                c0425d.f4789o0 = i10;
                c0425d.f4743J.c(i2, c0443o3, arrayList);
                c0425d.f4746M.c(i2, c0443o3, arrayList);
                c0424c = c0425d.f4745L;
            }
            c0424c.c(i2, c0443o3, arrayList);
            c0425d.f4749P.c(i2, c0443o3, arrayList);
        }
        return c0443o3;
    }

    public static byte[] H0(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = R.xml.backup_rules;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
            } else {
                throw new IllegalStateException("Not enough bytes to read: " + i2);
            }
        }
        return bArr;
    }

    public static final AbstractC0142u I(Activity activity) {
        View findViewById;
        Object next;
        o("<this>", activity);
        int i2 = AbstractC0483c.f5313b;
        if (Build.VERSION.SDK_INT >= R.styleable.Capability) {
            findViewById = (View) AbstractC0482b.a(activity, 2131231034);
        } else {
            findViewById = activity.findViewById(2131231034);
            if (findViewById == null) {
                throw new IllegalArgumentException("ID does not reference a View inside this Activity");
            }
        }
        n("requireViewById<View>(activity, viewId)", findViewById);
        i1.c cVar = new i1.c(new i1.d(new i1.h(X0.h.r1(findViewById, C0124b.f2336k), C0124b.f2337l, R.xml.data_extraction_rules)));
        if (!cVar.hasNext()) {
            next = null;
        } else {
            next = cVar.next();
        }
        AbstractC0142u abstractC0142u = (AbstractC0142u) next;
        if (abstractC0142u != null) {
            return abstractC0142u;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on 2131231034");
    }

    public static List I0(int i2, Resources resources) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (A.e.a(obtainTypedArray, R.xml.backup_rules) == R.xml.data_extraction_rules) {
                for (int i3 = R.xml.backup_rules; i3 < obtainTypedArray.length(); i3 += R.xml.data_extraction_rules) {
                    int resourceId = obtainTypedArray.getResourceId(i3, R.xml.backup_rules);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        int length = stringArray.length;
                        for (int i4 = R.xml.backup_rules; i4 < length; i4 += R.xml.data_extraction_rules) {
                            arrayList2.add(Base64.decode(stringArray[i4], (int) R.xml.backup_rules));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                int length2 = stringArray2.length;
                for (int i5 = R.xml.backup_rules; i5 < length2; i5 += R.xml.data_extraction_rules) {
                    arrayList3.add(Base64.decode(stringArray2[i5], (int) R.xml.backup_rules));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static int J(Context context, int i2, int i3) {
        Integer num;
        int i4;
        TypedValue N02 = N0(context, i2);
        if (N02 != null) {
            int i5 = N02.resourceId;
            if (i5 != 0) {
                Object obj = AbstractC0489d.f5360a;
                i4 = AbstractC0488c.a(context, i5);
            } else {
                i4 = N02.data;
            }
            num = Integer.valueOf(i4);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] J0(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.J0(java.io.FileInputStream, int, int):byte[]");
    }

    public static int K(View view, int i2) {
        Context context = view.getContext();
        TypedValue R02 = R0(view.getContext(), i2, view.getClass().getCanonicalName());
        int i3 = R02.resourceId;
        if (i3 != 0) {
            Object obj = AbstractC0489d.f5360a;
            return AbstractC0488c.a(context, i3);
        }
        return R02.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r6 != com.example.reverseexample.R.styleable.ActionMode) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r4.getName().equals("locales") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r3 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        if (r2.isEmpty() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        android.util.Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
        r9.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String K0(android.content.Context r9) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6b
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L65
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L43:
            if (r3 == 0) goto L51
        L45:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L51
            goto L45
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L64
        L61:
            r9.deleteFile(r0)
        L64:
            return r2
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r9
        L6b:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.K0(android.content.Context):java.lang.String");
    }

    public static ColorStateList L(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList a2;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, R.xml.backup_rules)) != 0 && (a2 = AbstractC0489d.a(context, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i2);
    }

    public static long L0(InputStream inputStream, int i2) {
        byte[] H02 = H0(inputStream, i2);
        long j2 = 0;
        for (int i3 = R.xml.backup_rules; i3 < i2; i3 += R.xml.data_extraction_rules) {
            j2 += (H02[i3] & 255) << (i3 * R.styleable.ActivityRule);
        }
        return j2;
    }

    public static ColorStateList M(Context context, C0151d c0151d, int i2) {
        int q2;
        ColorStateList a2;
        if (c0151d.t(i2) && (q2 = c0151d.q(i2, R.xml.backup_rules)) != 0 && (a2 = AbstractC0489d.a(context, q2)) != null) {
            return a2;
        }
        return c0151d.i(i2);
    }

    public static void M0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, R.xml.backup_rules, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            C.b.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static ColorStateList N(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= R.styleable.CardView && B.b.q(drawable)) {
            return B.b.c(B.b.e(drawable));
        }
        return null;
    }

    public static TypedValue N0(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static float O(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= R.styleable.CheckedTextView) {
            return M.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static boolean O0(Context context, int i2, boolean z2) {
        TypedValue N02 = N0(context, i2);
        if (N02 != null && N02.type == R.styleable.AppCompatSeekBar) {
            if (N02.data != 0) {
                return true;
            }
            return false;
        }
        return z2;
    }

    public static Drawable P(Context context, int i2) {
        return W0.c().e(context, i2);
    }

    public static int P0(Context context, int i2, int i3) {
        TypedValue N02 = N0(context, i2);
        if (N02 != null && N02.type == R.styleable.AppCompatEmojiHelper) {
            return N02.data;
        }
        return i3;
    }

    public static Drawable Q(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable P2;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, R.xml.backup_rules)) != 0 && (P2 = P(context, resourceId)) != null) {
            return P2;
        }
        return typedArray.getDrawable(i2);
    }

    public static TimeInterpolator Q0(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == R.styleable.ActionMenuView) {
            String valueOf = String.valueOf(typedValue.string);
            if (!g0(valueOf, "cubic-bezier") && !g0(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (g0(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(R.styleable.AppBarLayout, valueOf.length() - R.xml.data_extraction_rules).split(",");
                if (split.length == R.styleable.ActionMode) {
                    return K.a.b(T(split, R.xml.backup_rules), T(split, R.xml.data_extraction_rules), T(split, R.styleable.ActionMenuItemView), T(split, R.styleable.ActionMenuView));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (g0(valueOf, "path")) {
                return K.a.c(A.b.l(valueOf.substring(R.styleable.ActivityChooserView, valueOf.length() - R.xml.data_extraction_rules)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static final Class R(h1.a aVar) {
        o("<this>", aVar);
        Class a2 = ((c1.a) aVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a2;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a2;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a2;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a2;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a2;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a2;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a2;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a2;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a2;
            default:
                return a2;
        }
    }

    public static TypedValue R0(Context context, int i2, String str) {
        TypedValue N02 = N0(context, i2);
        if (N02 != null) {
            return N02;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static int S(List list) {
        o("<this>", list);
        return list.size() - 1;
    }

    public static void S0(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = R.xml.backup_rules; i3 < length; i3 += R.xml.data_extraction_rules) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + R.xml.data_extraction_rules, length));
    }

    public static float T(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final void T0(View view, InterfaceC0108t interfaceC0108t) {
        o("<this>", view);
        view.setTag(2131231227, interfaceC0108t);
    }

    public static Intent U(Activity activity) {
        Intent a2 = y.j.a(activity);
        if (a2 != null) {
            return a2;
        }
        try {
            String W2 = W(activity, activity.getComponentName());
            if (W2 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, W2);
            try {
                if (W(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + W2 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static final void U0(View view, InterfaceC0277f interfaceC0277f) {
        o("<this>", view);
        view.setTag(2131231229, interfaceC0277f);
    }

    public static Intent V(Context context, ComponentName componentName) {
        String W2 = W(context, componentName);
        if (W2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), W2);
        if (W(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static void V0(TextView textView, int i2) {
        int i3;
        A.b.d(i2);
        if (Build.VERSION.SDK_INT >= R.styleable.Capability) {
            s.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (o.a(textView)) {
            i3 = fontMetricsInt.top;
        } else {
            i3 = fontMetricsInt.ascent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static String W(Context context, ComponentName componentName) {
        int i2;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= R.styleable.CardView) {
            i2 = 269222528;
        } else {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(R.xml.backup_rules) == R.styleable.ConstraintSet) {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static void W0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z2;
        WeakHashMap weakHashMap = Y.f505a;
        boolean a2 = F.a(checkableImageButton);
        boolean z3 = false;
        int i2 = R.xml.data_extraction_rules;
        if (onLongClickListener != null) {
            z2 = R.xml.data_extraction_rules;
        } else {
            z2 = R.xml.backup_rules;
        }
        if (a2 || z2) {
            z3 = R.xml.data_extraction_rules;
        }
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(a2);
        checkableImageButton.setPressable(a2);
        checkableImageButton.setLongClickable(z2);
        if (!z3) {
            i2 = R.styleable.ActionMenuItemView;
        }
        G.s(checkableImageButton, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r8 != com.example.reverseexample.R.styleable.ActionMenuItemView) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r6 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static G.g X(android.widget.TextView r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            G.g r0 = new G.g
            android.text.PrecomputedText$Params r8 = M.s.c(r8)
            r0.<init>(r8)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r8.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r4 = M.q.a(r8)
            int r5 = M.q.d(r8)
            android.text.method.TransformationMethod r6 = r8.getTransformationMethod()
            boolean r6 = r6 instanceof android.text.method.PasswordTransformationMethod
            if (r6 == 0) goto L2e
        L2b:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LTR
            goto L72
        L2e:
            r6 = 1
            r7 = 0
            if (r0 < r1) goto L59
            int r0 = r8.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L59
            java.util.Locale r8 = M.p.d(r8)
            android.icu.text.DecimalFormatSymbols r8 = M.r.a(r8)
            java.lang.String[] r8 = M.s.b(r8)
            r8 = r8[r7]
            int r8 = r8.codePointAt(r7)
            byte r8 = java.lang.Character.getDirectionality(r8)
            if (r8 == r6) goto L56
            r0 = 2
            if (r8 != r0) goto L2b
        L56:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.RTL
            goto L72
        L59:
            int r0 = M.p.b(r8)
            if (r0 != r6) goto L60
            goto L61
        L60:
            r6 = r7
        L61:
            int r8 = M.p.c(r8)
            switch(r8) {
                case 2: goto L70;
                case 3: goto L2b;
                case 4: goto L56;
                case 5: goto L6d;
                case 6: goto L72;
                case 7: goto L6a;
                default: goto L68;
            }
        L68:
            if (r6 == 0) goto L72
        L6a:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L72
        L6d:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.LOCALE
            goto L72
        L70:
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.ANYRTL_LTR
        L72:
            G.g r8 = new G.g
            android.text.TextDirectionHeuristic r3 = (android.text.TextDirectionHeuristic) r3
            r8.<init>(r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.X(android.widget.TextView):G.g");
    }

    public static void X0(TextView textView, int i2) {
        int i3;
        A.b.d(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (o.a(textView)) {
            i3 = fontMetricsInt.bottom;
        } else {
            i3 = fontMetricsInt.descent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void Y0(Outline outline, Path path) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= R.styleable.Carousel) {
            D0.a.n(outline, path);
        } else if (i2 >= R.styleable.CardView) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    public static void Z0(View view, O0.g gVar) {
        E0.a aVar = gVar.f773a.f752b;
        if (aVar != null && aVar.f190a) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = Y.f505a;
                f2 += M.i((View) parent);
            }
            O0.f fVar = gVar.f773a;
            if (fVar.f763m != f2) {
                fVar.f763m = f2;
                gVar.n();
            }
        }
    }

    public static boolean a0(int i2, Rect rect, Rect rect2) {
        if (i2 != R.styleable.AppCompatImageView) {
            if (i2 != R.styleable.ChipGroup) {
                if (i2 != R.styleable.ImageFilterView) {
                    if (i2 == R.styleable.RecyclerView) {
                        int i3 = rect.top;
                        int i4 = rect2.top;
                        if ((i3 >= i4 && rect.bottom > i4) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i5 = rect.left;
                int i6 = rect2.left;
                if ((i5 >= i6 && rect.right > i6) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            if ((i7 <= i8 && rect.top < i8) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i9 = rect.right;
        int i10 = rect2.right;
        if ((i9 <= i10 && rect.left < i10) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    public static void a1(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= R.styleable.BottomSheetBehavior_Layout) {
            A1.a(view, charSequence);
            return;
        }
        C1 c12 = C1.f3963k;
        if (c12 != null && c12.f3965a == view) {
            C1.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C1 c13 = C1.f3964l;
            if (c13 != null && c13.f3965a == view) {
                c13.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C1(view, charSequence);
    }

    public static boolean b0(int i2) {
        boolean z2;
        double pow;
        double pow2;
        double pow3;
        if (i2 != 0) {
            ThreadLocal threadLocal = B.a.f77a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[R.styleable.ActionMenuView];
                threadLocal.set(dArr);
            }
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            if (dArr.length == R.styleable.ActionMenuView) {
                double d2 = red / 255.0d;
                if (d2 < 0.04045d) {
                    pow = d2 / 12.92d;
                } else {
                    pow = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                }
                double d3 = green / 255.0d;
                if (d3 < 0.04045d) {
                    pow2 = d3 / 12.92d;
                } else {
                    pow2 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                }
                double d4 = blue / 255.0d;
                if (d4 < 0.04045d) {
                    pow3 = d4 / 12.92d;
                } else {
                    pow3 = Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
                }
                z2 = false;
                dArr[R.xml.backup_rules] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d5 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[R.xml.data_extraction_rules] = d5;
                double d6 = pow3 * 0.9505d;
                dArr[R.styleable.ActionMenuItemView] = (d6 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d5 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    public static void b1(XmlResourceParser xmlResourceParser) {
        int i2 = R.xml.data_extraction_rules;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next != R.styleable.ActionMenuItemView) {
                if (next == R.styleable.ActionMenuView) {
                    i2--;
                }
            } else {
                i2 += R.xml.data_extraction_rules;
            }
        }
    }

    public static boolean c0(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static void c1(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= R.styleable.CardView) {
            AbstractC0374a.f(viewGroup, z2);
        } else if (f665o) {
            try {
                AbstractC0374a.f(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f665o = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0282, code lost:
        if (r2.f4728d == r7) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0108, code lost:
        if (r4.f4728d == r13) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0535 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0587 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0695 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:412:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x06fd A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(r.C0426e r36, p.C0415d r37, java.util.ArrayList r38, int r39) {
        /*
            Method dump skipped, instructions count: 1803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.d(r.e, p.d, java.util.ArrayList, int):void");
    }

    public static boolean d0() {
        try {
            if (f656f == null) {
                return AbstractC0374a.h();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f656f == null) {
                f655e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f656f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f656f.invoke(null, Long.valueOf(f655e))).booleanValue();
        } catch (Exception e2) {
            if (e2 instanceof InvocationTargetException) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
            return false;
        }
    }

    public static void d1(String str, Object obj) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(name + " cannot be cast to " + str);
        S0(c.class.getName(), classCastException);
        throw classCastException;
    }

    public static void e(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, R.xml.backup_rules, copyOf, length, drawableState2.length);
                C.b.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                C.b.h(drawable, colorStateList);
            }
            if (mode != null) {
                C.b.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static boolean e0(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static void e1() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static boolean f0(View view) {
        WeakHashMap weakHashMap = Y.f505a;
        if (H.d(view) == R.xml.data_extraction_rules) {
            return true;
        }
        return false;
    }

    public static void f1(String str) {
        RuntimeException runtimeException = new RuntimeException("lateinit property " + str + " has not been initialized");
        S0(c.class.getName(), runtimeException);
        throw runtimeException;
    }

    public static Collection g(AbstractCollection abstractCollection) {
        if ((abstractCollection instanceof d1.a) && !(abstractCollection instanceof d1.b)) {
            d1("kotlin.collections.MutableCollection", abstractCollection);
            throw null;
        }
        return abstractCollection;
    }

    public static boolean g0(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static int g1(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(R.xml.backup_rules, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int h(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return R.styleable.ActionMode;
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility == R.styleable.ActionMode) {
                return R.styleable.ActionMode;
            }
            if (visibility == R.styleable.ActivityRule) {
                return R.styleable.ActionMenuView;
            }
            throw new IllegalArgumentException("Unknown visibility " + visibility);
        }
        return R.styleable.ActionMenuItemView;
    }

    public static int h0(int i2, int i3, float f2) {
        return B.a.b(B.a.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static final Map h1(LinkedHashMap linkedHashMap) {
        o("<this>", linkedHashMap);
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        n("with(...)", singletonMap);
        return singletonMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r10.right <= r12.left) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r10.left >= r12.right) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r9 == com.example.reverseexample.R.styleable.AppCompatImageView) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
        if (r9 != com.example.reverseexample.R.styleable.ImageFilterView) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
        r11 = k0(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (r9 == com.example.reverseexample.R.styleable.AppCompatImageView) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
        if (r9 == com.example.reverseexample.R.styleable.ChipGroup) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r9 == com.example.reverseexample.R.styleable.ImageFilterView) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
        if (r9 != com.example.reverseexample.R.styleable.RecyclerView) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0065, code lost:
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006a, code lost:
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r11 >= java.lang.Math.max((int) com.example.reverseexample.R.xml.data_extraction_rules, r9 - r10)) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean i(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = j(r9, r10, r11)
            boolean r1 = j(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = k0(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.i(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [W0.b, java.lang.Object, W0.h] */
    public static W0.b i0(C0145x c0145x) {
        W0.c[] cVarArr = W0.c.f1544a;
        W0.f fVar = W0.f.f1550a;
        ?? obj = new Object();
        obj.f1552a = c0145x;
        obj.f1553b = fVar;
        return obj;
    }

    public static boolean j(int i2, Rect rect, Rect rect2) {
        if (i2 != R.styleable.AppCompatImageView) {
            if (i2 != R.styleable.ChipGroup) {
                if (i2 != R.styleable.ImageFilterView) {
                    if (i2 != R.styleable.RecyclerView) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static List j0(Object obj) {
        List singletonList = Collections.singletonList(obj);
        n("singletonList(...)", singletonList);
        return singletonList;
    }

    public static ActionMode.Callback j1(ActionMode.Callback callback) {
        if ((callback instanceof t) && Build.VERSION.SDK_INT >= R.styleable.BottomSheetBehavior_Layout) {
            return ((t) callback).f715a;
        }
        return callback;
    }

    public static void k(String str, Object obj) {
        if (obj != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(str.concat(" must not be null"));
        S0(c.class.getName(), illegalStateException);
        throw illegalStateException;
    }

    public static int k0(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 != R.styleable.AppCompatImageView) {
            if (i2 != R.styleable.ChipGroup) {
                if (i2 != R.styleable.ImageFilterView) {
                    if (i2 == R.styleable.RecyclerView) {
                        i3 = rect2.top;
                        i4 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i3 = rect2.left;
                    i4 = rect.right;
                }
            } else {
                i3 = rect.top;
                i4 = rect2.bottom;
            }
        } else {
            i3 = rect.left;
            i4 = rect2.right;
        }
        return Math.max((int) R.xml.backup_rules, i3 - i4);
    }

    public static boolean k1(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        if (i4 != R.xml.data_extraction_rules && i4 != R.styleable.ActionMenuItemView && (i4 != R.styleable.ActionMode || i2 == R.styleable.ActionMenuItemView)) {
            z2 = R.xml.backup_rules;
        } else {
            z2 = R.xml.data_extraction_rules;
        }
        if (i5 != R.xml.data_extraction_rules && i5 != R.styleable.ActionMenuItemView && (i5 != R.styleable.ActionMode || i3 == R.styleable.ActionMenuItemView)) {
            z3 = R.xml.backup_rules;
        } else {
            z3 = R.xml.data_extraction_rules;
        }
        if (z2 || z3) {
            return true;
        }
        return false;
    }

    public static void l(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        S0(c.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static int l0(int i2) {
        if (i2 >= 0) {
            if (i2 < R.styleable.ActionMenuView) {
                return i2 + R.xml.data_extraction_rules;
            }
            if (i2 < 1073741824) {
                return (int) ((i2 / 0.75f) + 1.0f);
            }
            return Integer.MAX_VALUE;
        }
        return i2;
    }

    public static ActionMode.Callback l1(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= R.styleable.BottomSheetBehavior_Layout && i2 <= R.styleable.ButtonBarLayout && !(callback instanceof t) && callback != null) {
            return new t(callback, textView);
        }
        return callback;
    }

    public static void m(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        S0(c.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static final boolean m0(AbstractC0120D abstractC0120D, int i2) {
        o("<this>", abstractC0120D);
        int i3 = AbstractC0120D.f2255j;
        for (AbstractC0120D abstractC0120D2 : X0.h.r1(abstractC0120D, C0124b.f2334i)) {
            if (abstractC0120D2.f2263h == i2) {
                return true;
            }
        }
        return false;
    }

    public static void m1(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = R.xml.backup_rules; i3 < i2; i3 += R.xml.data_extraction_rules) {
            bArr[i3] = (byte) ((j2 >> (i3 * R.styleable.ActivityRule)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void n(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        S0(c.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static Typeface n0(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT >= R.styleable.CheckedTextView && AbstractC0009d.a(configuration) != Integer.MAX_VALUE && AbstractC0009d.a(configuration) != 0 && typeface != null) {
            return G.f.e(typeface, A.b.f(AbstractC0009d.a(configuration) + G.f.a(typeface), R.xml.data_extraction_rules, 1000), typeface.isItalic());
        }
        return null;
    }

    public static void n1(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        m1(byteArrayOutputStream, i2, R.styleable.ActionMenuItemView);
    }

    public static void o(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(B(str));
        S0(c.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static int o0(int i2, Rect rect, Rect rect2) {
        int height;
        int i3;
        int height2;
        if (i2 != R.styleable.AppCompatImageView) {
            if (i2 != R.styleable.ChipGroup) {
                if (i2 != R.styleable.ImageFilterView) {
                    if (i2 != R.styleable.RecyclerView) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = (rect.width() / R.styleable.ActionMenuItemView) + rect.left;
            i3 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - ((height2 / R.styleable.ActionMenuItemView) + i3));
        }
        height = (rect.height() / R.styleable.ActionMenuItemView) + rect.top;
        i3 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - ((height2 / R.styleable.ActionMenuItemView) + i3));
    }

    public static void p() {
        if (R.styleable.AppCompatEmojiHelper <= new g1.a(R.styleable.ActionMenuItemView, R.styleable.ClockHandView, R.xml.data_extraction_rules).f3324b) {
            return;
        }
        throw new IllegalArgumentException("radix 16 was not in valid range " + new g1.a(R.styleable.ActionMenuItemView, R.styleable.ClockHandView, R.xml.data_extraction_rules));
    }

    public static final ArrayList p0(LinkedHashMap linkedHashMap, l lVar) {
        o("<this>", linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C0129g c0129g = (C0129g) entry.getValue();
            if (c0129g != null && !c0129g.f2348b && !c0129g.f2349c) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) lVar.b((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int q(Context context, String str) {
        int c2;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d2 = y.f.d(str);
        if (d2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[R.xml.backup_rules];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && H.b.a(packageName2, packageName)) {
                if (Build.VERSION.SDK_INT >= R.styleable.CardView) {
                    AppOpsManager c3 = y.g.c(context);
                    c2 = y.g.a(c3, d2, Binder.getCallingUid(), packageName);
                    if (c2 == 0) {
                        c2 = y.g.a(c3, d2, myUid, y.g.b(context));
                    }
                } else {
                    c2 = y.f.c((AppOpsManager) y.f.a(context, AppOpsManager.class), d2, packageName);
                }
            } else {
                c2 = y.f.c((AppOpsManager) y.f.a(context, AppOpsManager.class), d2, packageName);
            }
            if (c2 != 0) {
                return -2;
            }
        }
        return R.xml.backup_rules;
    }

    public static final K q0(l lVar) {
        L l2 = new L();
        lVar.b(l2);
        boolean z2 = l2.f2291b;
        b0.J j2 = l2.f2290a;
        j2.getClass();
        boolean z3 = l2.f2292c;
        j2.getClass();
        int i2 = l2.f2293d;
        boolean z4 = l2.f2294e;
        j2.getClass();
        j2.getClass();
        j2.getClass();
        j2.getClass();
        return new K(z2, z3, i2, false, z4, j2.f2277a, j2.f2278b, j2.f2279c, j2.f2280d);
    }

    public static void r0(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static byte[] t(byte[] bArr) {
        Deflater deflater = new Deflater(R.xml.data_extraction_rules);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static int u(b0 b0Var, AbstractC0205B abstractC0205B, View view, View view2, AbstractC0217N abstractC0217N, boolean z2) {
        if (abstractC0217N.v() != 0 && b0Var.b() != 0 && view != null && view2 != null) {
            if (!z2) {
                return Math.abs(AbstractC0217N.F(view) - AbstractC0217N.F(view2)) + R.xml.data_extraction_rules;
            }
            return Math.min(abstractC0205B.g(), abstractC0205B.b(view2) - abstractC0205B.d(view));
        }
        return R.xml.backup_rules;
    }

    public static int v(b0 b0Var, AbstractC0205B abstractC0205B, View view, View view2, AbstractC0217N abstractC0217N, boolean z2, boolean z3) {
        int max;
        if (abstractC0217N.v() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return R.xml.backup_rules;
        }
        int min = Math.min(AbstractC0217N.F(view), AbstractC0217N.F(view2));
        int max2 = Math.max(AbstractC0217N.F(view), AbstractC0217N.F(view2));
        if (z3) {
            max = Math.max((int) R.xml.backup_rules, (b0Var.b() - max2) - 1);
        } else {
            max = Math.max((int) R.xml.backup_rules, min);
        }
        if (!z2) {
            return max;
        }
        return Math.round((max * (Math.abs(abstractC0205B.b(view2) - abstractC0205B.d(view)) / (Math.abs(AbstractC0217N.F(view) - AbstractC0217N.F(view2)) + R.xml.data_extraction_rules))) + (abstractC0205B.f() - abstractC0205B.d(view)));
    }

    public static int w(b0 b0Var, AbstractC0205B abstractC0205B, View view, View view2, AbstractC0217N abstractC0217N, boolean z2) {
        if (abstractC0217N.v() != 0 && b0Var.b() != 0 && view != null && view2 != null) {
            if (!z2) {
                return b0Var.b();
            }
            return (int) (((abstractC0205B.b(view2) - abstractC0205B.d(view)) / (Math.abs(AbstractC0217N.F(view) - AbstractC0217N.F(view2)) + R.xml.data_extraction_rules)) * b0Var.b());
        }
        return R.xml.backup_rules;
    }

    public static float w0(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= R.styleable.CheckedTextView) {
            return M.e.c(edgeEffect, f2, f3);
        }
        M.d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static ImageView.ScaleType x(int i2) {
        if (i2 != 0) {
            if (i2 != R.xml.data_extraction_rules) {
                if (i2 != R.styleable.ActionMenuItemView) {
                    if (i2 != R.styleable.ActionMenuView) {
                        if (i2 != R.styleable.ActivityChooserView) {
                            if (i2 != R.styleable.ActivityFilter) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [S.v, S.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static S.v y(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            S.d r0 = new S.d
            r0.<init>()
            goto L11
        Lc:
            S.c r0 = new S.c
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            A.b.e(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2a
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2a
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2a
            goto L47
        L46:
            r4 = r5
        L47:
            if (r4 != 0) goto L4b
        L49:
            r1 = r5
            goto L7a
        L4b:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            android.content.pm.Signature[] r0 = r0.i(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
        L59:
            if (r3 >= r6) goto L67
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r3 = r3 + 1
            goto L59
        L67:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            k.s r1 = new k.s     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            goto L7a
        L73:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L49
        L7a:
            if (r1 != 0) goto L7d
            goto L87
        L7d:
            S.v r5 = new S.v
            S.u r0 = new S.u
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.y(android.content.Context):S.v");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [d.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [d.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [d.a, java.lang.Object] */
    public static AbstractC0156a z(int i2) {
        if (i2 != 0) {
            if (i2 != R.xml.data_extraction_rules) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public abstract void A0(View view, float f2, float f3);

    public int Y(View view) {
        return R.xml.backup_rules;
    }

    public int Z() {
        return R.xml.backup_rules;
    }

    public abstract boolean i1(View view, int i2);

    public abstract int r(View view, int i2);

    public abstract int s(View view, int i2);

    public abstract void u0(Throwable th);

    public abstract void v0(C0262h c0262h);

    public abstract void y0(int i2);

    public abstract void z0(View view, int i2, int i3);

    @Override // I.InterfaceC0020i0
    public void b(View view) {
    }

    @Override // I.InterfaceC0020i0
    public void c() {
    }

    public void t0() {
    }

    public void s0(int i2, int i3) {
    }

    public void x0(View view, int i2) {
    }
}