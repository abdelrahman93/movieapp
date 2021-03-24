package com.task.nutritionapp.data.model.units

import com.google.gson.annotations.SerializedName

data class ENERCKCAL(

	@field:SerializedName("unit")
	val unit: String? = null,

	@field:SerializedName("quantity")
	val quantity: Double? = null,

	@field:SerializedName("label")
	val label: String? = null
)