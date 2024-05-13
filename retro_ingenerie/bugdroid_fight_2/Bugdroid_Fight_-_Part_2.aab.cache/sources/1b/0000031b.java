package com.example.reverseexample;

import L0.c;
import W.C0047e;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import b0.AbstractC0142u;
import c.C0151d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import d.AbstractC0156a;
import e0.C0160a;
import e0.b;
import g.AbstractActivityC0189l;
import g.C0187j;
import g.C0188k;
import g.LayoutInflater$Factory2C0166D;
import g.Q;
import g.W;
import i.C0262h;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedHashSet;
import o0.C0410b;

/* loaded from: base/dex/classes.dex */
public final class MainActivity extends AbstractActivityC0189l {

    /* renamed from: B  reason: collision with root package name */
    public static final /* synthetic */ int f2483B = 0;

    /* renamed from: A  reason: collision with root package name */
    public C0262h f2484A;

    /* renamed from: z  reason: collision with root package name */
    public b f2485z;

    public MainActivity() {
        this.f1633e.f3736b.d("androidx:appcompat", new C0187j(this));
        h(new C0188k(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // W.B, a.AbstractActivityC0083n, y.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        View inflate = layoutInflater.inflate(2131427356, (ViewGroup) null, false);
        int i2 = 2131230802;
        View G2 = c.G(inflate, 2131230802);
        if (G2 != null) {
            int i3 = 2131230907;
            FloatingActionButton floatingActionButton = (FloatingActionButton) c.G(G2, 2131230907);
            if (floatingActionButton != null) {
                i3 = 2131231207;
                Toolbar toolbar = (Toolbar) c.G(G2, 2131231207);
                if (toolbar != null) {
                    C0151d c0151d = new C0151d((CoordinatorLayout) G2, floatingActionButton, toolbar, R.styleable.AnimatedStateListDrawableItem);
                    DrawerLayout drawerLayout = (DrawerLayout) inflate;
                    NavigationView navigationView = (NavigationView) c.G(inflate, 2131231036);
                    if (navigationView != null) {
                        this.f2484A = new C0262h(drawerLayout, c0151d, drawerLayout, navigationView);
                        setContentView(drawerLayout);
                        C0262h c0262h = this.f2484A;
                        if (c0262h != null) {
                            Toolbar toolbar2 = (Toolbar) ((C0151d) c0262h.f3673b).f2460d;
                            LayoutInflater$Factory2C0166D layoutInflater$Factory2C0166D = (LayoutInflater$Factory2C0166D) k();
                            if (layoutInflater$Factory2C0166D.f3153j instanceof Activity) {
                                layoutInflater$Factory2C0166D.B();
                                AbstractC0156a abstractC0156a = layoutInflater$Factory2C0166D.f3158o;
                                if (!(abstractC0156a instanceof W)) {
                                    layoutInflater$Factory2C0166D.f3159p = null;
                                    if (abstractC0156a != null) {
                                        abstractC0156a.s();
                                    }
                                    layoutInflater$Factory2C0166D.f3158o = null;
                                    if (toolbar2 != null) {
                                        Object obj = layoutInflater$Factory2C0166D.f3153j;
                                        if (obj instanceof Activity) {
                                            charSequence = ((Activity) obj).getTitle();
                                        } else {
                                            charSequence = layoutInflater$Factory2C0166D.f3160q;
                                        }
                                        Q q2 = new Q(toolbar2, charSequence, layoutInflater$Factory2C0166D.f3156m);
                                        layoutInflater$Factory2C0166D.f3158o = q2;
                                        layoutInflater$Factory2C0166D.f3156m.f3313b = q2.f3198c;
                                        toolbar2.setBackInvokedCallbackEnabled(true);
                                    } else {
                                        layoutInflater$Factory2C0166D.f3156m.f3313b = null;
                                    }
                                    layoutInflater$Factory2C0166D.b();
                                } else {
                                    throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                                }
                            }
                            C0262h c0262h2 = this.f2484A;
                            if (c0262h2 != null) {
                                ((FloatingActionButton) ((C0151d) c0262h2.f3673b).f2459c).setOnClickListener(new Object());
                                C0262h c0262h3 = this.f2484A;
                                if (c0262h3 != null) {
                                    DrawerLayout drawerLayout2 = (DrawerLayout) c0262h3.f3674c;
                                    c.n("drawerLayout", drawerLayout2);
                                    C0262h c0262h4 = this.f2484A;
                                    if (c0262h4 != null) {
                                        NavigationView navigationView2 = (NavigationView) c0262h4.f3675d;
                                        c.n("navView", navigationView2);
                                        AbstractC0142u I2 = c.I(this);
                                        Integer[] numArr = {2131231032, 2131231031, 2131231035};
                                        LinkedHashSet linkedHashSet = new LinkedHashSet(c.l0(R.styleable.ActionMenuView));
                                        for (int i4 = R.xml.backup_rules; i4 < R.styleable.ActionMenuView; i4 += R.xml.data_extraction_rules) {
                                            linkedHashSet.add(numArr[i4]);
                                        }
                                        HashSet hashSet = new HashSet();
                                        hashSet.addAll(linkedHashSet);
                                        b bVar = new b(hashSet, drawerLayout2, new C0410b());
                                        this.f2485z = bVar;
                                        I2.b(new C0160a(this, bVar));
                                        navigationView2.setNavigationItemSelectedListener(new C0047e(I2, navigationView2));
                                        I2.b(new e0.c(new WeakReference(navigationView2), I2));
                                        return;
                                    }
                                    c.f1("binding");
                                    throw null;
                                }
                                c.f1("binding");
                                throw null;
                            }
                            c.f1("binding");
                            throw null;
                        }
                        c.f1("binding");
                        throw null;
                    }
                    i2 = 2131231036;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(G2.getResources().getResourceName(i3)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        c.o("menu", menu);
        getMenuInflater().inflate(2131558401, menu);
        return true;
    }
}