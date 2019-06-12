import React, { Component } from "react"
import { StyleSheet, Text, View } from "react-native"
import { connect } from "react-redux"
import HeroEvaluation from "../View/HeroEvaluation/HeroEvaluation"
import Synergy from "../View/Synergy/Synergy"
import ItemEvaluation from "../View/ItemEvaluation/ItemEvaluation"

const s = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "white",
    flexDirection: "row",
    justifyContent: "space-evenly",
    alignItems: "center"
  }
})

class DefaultBody extends Component {
  render() {
    const { selectedMenu } = this.props.commonInfo

    return (
      <View style={s.container}>
        <View>
          {selectedMenu === "hero" ? (
            <HeroEvaluation />
          ) : selectedMenu === "synergy" ? (
            <Synergy />
          ) : selectedMenu === "item" ? (
            <ItemEvaluation />
          ) : (
            <ErrorPage />
          )}
        </View>
      </View>
    )
  }
}

const mapStateToProps = state => ({
  commonInfo: state.commonInfo
})

export default connect(mapStateToProps)(DefaultBody)
