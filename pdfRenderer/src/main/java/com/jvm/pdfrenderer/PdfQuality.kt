package com.jvm.pdfrenderer
/**
 * Created by Jibu Varghese on 24,Nov,2021
 */

enum class PdfQuality(val ratio: Int) {
    FAST(1),
    NORMAL(2),
    ENHANCED(3)
}