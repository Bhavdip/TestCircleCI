package creoelstudios.testcircleci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by bhavdip on 3/15/17.
 */

public class TextViewOutLine extends View {

  private Paint mPaintMainText;
  private Paint mPaintOutLineText;

  public TextViewOutLine(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public TextViewOutLine(Context context, AttributeSet attrs) {
    super(context, attrs);
    initOutLineComponents();
  }

  public TextViewOutLine(Context context) {
    super(context);
  }

  private void initOutLineComponents() {
    mPaintMainText = new Paint();
    mPaintMainText.setAntiAlias(true);
    mPaintMainText.setTextSize(18);
    mPaintMainText.setStyle(Paint.Style.FILL);
    mPaintMainText.setColor(0xFF000000);

    mPaintOutLineText = new Paint();
    mPaintOutLineText.setAntiAlias(true);
    mPaintOutLineText.setStyle(Paint.Style.STROKE);
    mPaintOutLineText.setStrokeWidth(4);
    mPaintOutLineText.setColor(0xFF000000);
    setPadding(4, 4, 4, 4);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    super.onDraw(canvas);
    int mAscent = 10;
    canvas.drawText("Bhavdip", getWidth()/2, getHeight()/2, mPaintOutLineText);
    canvas.drawText("Bhavdip", getWidth()/2, getHeight()/2, mPaintMainText);
  }
}

