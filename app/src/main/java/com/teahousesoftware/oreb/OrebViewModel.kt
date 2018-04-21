package com.teahousesoftware.oreb

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.teahousesoftware.oreb.shared.model.guitar.Guitar
import com.teahousesoftware.oreb.shared.model.music.Scale
import com.teahousesoftware.oreb.shared.model.music.TheoreticalNote
import com.teahousesoftware.oreb.shared.model.music.Tuning

class OrebViewModel() : ViewModel() {
    // Reasonable initial values for Larrivee on Galaxy Tab S2, wide orientation
    val DRAW_SCALE_MIN = 75f
    val DRAW_SCALE_MAX = 250f

    lateinit var tunings:List<Tuning>
    lateinit var scales:List<Scale>
    lateinit var guitar:Guitar
    lateinit var key:TheoreticalNote
    lateinit var scale:Scale

    var drawScale: Float = DRAW_SCALE_MIN   // Driven by pinch/zoom scaling.  Start zoomed out.
}