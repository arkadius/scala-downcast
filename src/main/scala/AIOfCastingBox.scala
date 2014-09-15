trait AIOfCastingBox[T] {
  val value: Any

  def casted: T = value.asInstanceOf[T]
}