package com.example.reverseexample.ui.home;

import L0.c;
import Q0.n;
import W.AbstractComponentCallbacksC0066y;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.C0151d;
import com.example.reverseexample.R;
import com.example.reverseexample.ui.home.HomeFragment;
import com.google.android.material.textfield.TextInputEditText;
import d0.l;
import i.C0262h;
import java.util.HashMap;
import q0.C0420a;
import r0.b;

/* loaded from: base/dex/classes.dex */
public final class HomeFragment extends AbstractComponentCallbacksC0066y {

    /* renamed from: W  reason: collision with root package name */
    public static final /* synthetic */ int f2487W = 0;

    /* renamed from: V  reason: collision with root package name */
    public C0262h f2488V;

    @Override // W.AbstractComponentCallbacksC0066y
    public final View v(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        c.o("inflater", layoutInflater);
        b bVar = (b) new C0151d(this).f(b.class);
        View inflate = layoutInflater.inflate(2131427376, viewGroup, false);
        int i2 = 2131230821;
        Button button = (Button) c.G(inflate, 2131230821);
        if (button != null) {
            i2 = 2131231190;
            TextView textView = (TextView) c.G(inflate, 2131231190);
            if (textView != null) {
                i2 = 2131231191;
                TextInputEditText textInputEditText = (TextInputEditText) c.G(inflate, 2131231191);
                if (textInputEditText != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    this.f2488V = new C0262h(constraintLayout, button, textView, textInputEditText);
                    c.n("getRoot(...)", constraintLayout);
                    C0262h c0262h = this.f2488V;
                    c.l(c0262h);
                    TextView textView2 = (TextView) c0262h.f3674c;
                    c.n("textHome", textView2);
                    bVar.f4890d.d(l(), new l(R.styleable.ActionMenuItemView, new C0420a(textView2, R.xml.data_extraction_rules)));
                    C0262h c0262h2 = this.f2488V;
                    c.l(c0262h2);
                    final TextInputEditText textInputEditText2 = (TextInputEditText) c0262h2.f3675d;
                    c.n("textInput", textInputEditText2);
                    C0262h c0262h3 = this.f2488V;
                    c.l(c0262h3);
                    ((Button) c0262h3.f3673b).setOnClickListener(new View.OnClickListener() { // from class: r0.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String str;
                            int i3 = r2;
                            Object obj = textInputEditText2;
                            Object obj2 = this;
                            switch (i3) {
                                case R.xml.backup_rules /* 0 */:
                                    HomeFragment homeFragment = (HomeFragment) obj2;
                                    TextInputEditText textInputEditText3 = (TextInputEditText) obj;
                                    int i4 = HomeFragment.f2487W;
                                    c.o("this$0", homeFragment);
                                    c.o("$textInput", textInputEditText3);
                                    Context i5 = homeFragment.i();
                                    String valueOf = String.valueOf(textInputEditText3.getText());
                                    String string = homeFragment.G().getResources().getString(2131820571);
                                    c.n("getString(...)", string);
                                    HashMap hashMap = new HashMap();
                                    String string2 = homeFragment.G().getResources().getString(2131820573);
                                    c.n("getString(...)", string2);
                                    String string3 = homeFragment.G().getResources().getString(2131820595);
                                    c.n("getString(...)", string3);
                                    for (int i6 = R.xml.backup_rules; i6 < string2.length() && i6 < string3.length(); i6 += R.xml.data_extraction_rules) {
                                        hashMap.put(Character.valueOf(string2.charAt(i6)), Character.valueOf(string3.charAt(i6)));
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    for (int length = valueOf.length() - R.xml.data_extraction_rules; -1 < length; length--) {
                                        char charAt = valueOf.charAt(length);
                                        sb.append(((Character) hashMap.getOrDefault(Character.valueOf(charAt), Character.valueOf(charAt))).charValue());
                                    }
                                    String sb2 = sb.toString();
                                    c.n("toString(...)", sb2);
                                    if (c.f(sb2, string)) {
                                        str = "Correct!";
                                    } else {
                                        str = "Incorrect!";
                                    }
                                    Toast.makeText(i5, str, (int) R.xml.backup_rules).show();
                                    return;
                                default:
                                    n nVar = (n) obj2;
                                    int[] iArr = n.f972C;
                                    nVar.getClass();
                                    ((View.OnClickListener) obj).onClick(view);
                                    nVar.a(R.xml.data_extraction_rules);
                                    return;
                            }
                        }
                    });
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    @Override // W.AbstractComponentCallbacksC0066y
    public final void w() {
        this.f1499D = true;
        this.f2488V = null;
    }
}