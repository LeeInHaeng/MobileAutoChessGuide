import React, { Component } from "react";
import { StyleSheet, Text, View } from "react-native";
import DefaultHeader from "./src/Layout/DefaultHeader";
import DefaultBody from "./src/Layout/DefaultBody";
import DefaultFooter from "./src/Layout/DefaultFooter";
import { Provider } from "react-redux";
import store from "./store"

console.disableYellowBox = true

const s = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff"
  }
});

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      foo: "bar"
    };
  }

  render() {
    return (
      <Provider store={store}>
        <View style={s.container}>
          <DefaultHeader />
          <DefaultBody />
          <DefaultFooter />
        </View>
      </Provider>
    );
  }
}

export default App;
