package org.techtown.customlayout

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

/*
part1.xml 의 최상위 Layout 은 LinearLayout 입니다.
이 LinearLayout 을 상속 받게 되면 Part1 Class 는 part1.xml 파일과 한 쌍이 될 수 있습니다.
LinearLayout 는 UI 객체 입니다.
 */
class Part1 : LinearLayout {

    // Source 에서 사용하는 생성자
    constructor(context: Context?) : super(context) {
        onInit(context)
    }

    // 화면 Layout (xml File) 에서 정의한 Button 들이 호출하는 생성자
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        onInit(context)
    }

    fun onInit (context: Context?) {
        // layout 하위의 port1 이라는 File 을 이 객체 (this) 에 붙여줍니다. 바로 (true)
        LayoutInflater.from(context).inflate(R.layout.part1, this, true)
    }
}