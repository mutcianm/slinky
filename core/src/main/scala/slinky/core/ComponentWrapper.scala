package slinky.core

import scala.language.implicitConversions

abstract class ComponentWrapper(implicit sr: StateReaderProvider, sw: StateWriterProvider) extends BaseComponentWrapper(sr, sw) {
  override type Definition = DefinitionBase[Props, State, Snapshot]
}
