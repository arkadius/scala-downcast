import scala.reflect.ClassTag

trait CTCastingBox[T] {
  val value: Any

  def casted(implicit classTag: ClassTag[T]): T = value match {
    case t: T => t
    case _    => throw new ClassCastException(s"Cannot cast $value to expected type: $classTag")
  }
}
