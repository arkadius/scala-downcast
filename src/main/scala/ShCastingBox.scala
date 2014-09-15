import shapeless.Typeable

trait ShCastingBox[T] {
  val value: Any

  def casted(implicit typeable: Typeable[T]): T = typeable.cast(value) match {
    case Some(t) => t
    case None    => throw new ClassCastException(s"Cannot cast $value to expected type")
  }
}