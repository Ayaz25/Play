
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play Schwimmen")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
"""),_display_(/*4.2*/defining(play.core.PlayVersion.current)/*4.41*/ { version =>_display_(Seq[Any](format.raw/*4.54*/("""

"""),format.raw/*6.1*/("""<section id="content">
  <div class="wrapper doc">
    <article>
      <h2>Tim Schober und Ayaz Hasan</h2>
      <p></p>
      <p>Here you can play the game "Schwimmen"</p>

      <h3 id="introduction">Rules</h3>
      <p>Every Player is getting three cards.
        The goal of the game is to not be the one with the smallest card value.
        To achieve this goal the player can swap either one or all of his cards with the three cards on the field,
        he is also allowed to skip a round or to "knock", which means that there's one last round left til the cards are counted.
        When two cards have the same colour(for example spades) their value is added together. The Value of a card is defined as followed::
      </p>
      <ul>
        <li>An ace has a value of 11</li>
        <li>A face card such as king, queen or jack has a value of 10</li>
        <li>Every card with a number has a value of this very number</li>
        <li>Three cards of the same face or number but different colour is defined as a value of 30 1/2</li>
      </ul>

      <h3 id="introduction">How to play our version:</h3>
      <p>First of all you have to type with how many players you want to play. It is possible to play with up to nine players.</p>

      <img src="assets/images/player-number.png" alt="number of the player" class="small-5 medium-4 large-3" />

      <p>After that you can give every player a name</p>

      <img src="assets/images/player-names.png" alt="name of the each player" class="small-5 medium-4 large-3" />

      <p>Now the game can start and a GUI will pop up.</p>

      <img src="assets/images/hauptmenu.png" alt="Main menu" class="small-5 medium-4 large-3" />

      <p>In the bottom left corner you can see the name of the current player. This player can now decide if he wants to:</p>
      <ul>
        <li>change one of his cards by selecting the card of the field he wants to get and the card of his hand he
          wants to throw on the field and by pressing the ChangeOneCard button afterwards.
        </li>
        <li>change all of his cards by pressing the ChangeAllCards button.</li>
        <li>knock by pressing the Knock button, doing that will end the game after the next round.</li>
        <li>skip this round by pressing the Skip button.</li>
      </ul>

      <p>The game will either end by someone who knocked or if someone gets 31 points which is called a stop.
        To continue the game u have to type "nr" and the player with the least points loose one life.
      </p>

      <img src="assets/images/game-over.png" alt="name of the each player" class="small-5 medium-4 large-3" />

      <p>If a player has no more lives left he will be removed from the game and the rest of the players can continue
        playing til only one player is left.
      </p>
    </article>

  </div>
</section>
""")))}),format.raw/*63.2*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: f68b9c7c57af1091940085b82fc99684a30b3a1b
                  MATRIX: 722->1|818->3|848->8|889->41|928->43|956->46|1003->85|1053->98|1083->102|4026->3015
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|31->6|88->63
                  -- GENERATED --
              */
          