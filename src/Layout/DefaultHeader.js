import React, { Component } from "react";
import { StyleSheet, Text, View } from "react-native";

const styles = StyleSheet.create({
  container: {
    // flex: 1,
    height: 50,
    backgroundColor: "pink",
    flexDirection: "row",
    justifyContent: "space-evenly",
    alignItems: "center"
  }
});

class DefaultHeader extends Component {
  constructor(props) {
    super(props);
    this.state = {
      foo: "bar"
    };
  }

  render() {
    return (
      <View style={styles.container}>
        <View>
          <Text>헤더입니다.</Text>
        </View>
      </View>
    );
  }
}

export default DefaultHeader;
