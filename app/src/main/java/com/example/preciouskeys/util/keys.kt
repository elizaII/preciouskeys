package com.example.preciouskeys.util

object Keys {
    //    const val MODEL_PATH = "tensorflow_inception_graph.pb"
    const val MODEL_PATH = "inception_v4_299_quant.tflite"
    const val LABEL_PATH = "labels.txt"
    const val INPUT_NAME = "input"
    const val OUTPUT_NAME = "output"
    const val IMAGE_MEAN: Int = 0
    const val IMAGE_STD: Float = 0.toFloat()
    const val INPUT_SIZE = 299
    const val MAX_RESULTS = 3
    const val DIM_BATCH_SIZE = 1
    const val DIM_PIXEL_SIZE = 3
    const val DIM_IMG_SIZE_X = 299
    const val DIM_IMG_SIZE_Y = 299

}