package com.awoshe.paywithslydepay.views;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.awoshe.paywithslydepay.R;

public class CustomTextView extends android.support.v7.widget.AppCompatTextView{

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            setTextColor(getContext().getResources().getColor(R.color.textColor));
        }
    }
}
