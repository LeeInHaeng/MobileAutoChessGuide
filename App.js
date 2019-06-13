import React, { Component } from "react"
import HeroEvaluation from "./src/View/HeroEvaluation/HeroEvaluation"
import ItemEvaluation from "./src/View/ItemEvaluation/ItemEvaluation"
import Synergy from "./src/View/Synergy/Synergy"
import { Provider } from "react-redux"
import store from "./store"
import { createBottomTabNavigator, createAppContainer } from "react-navigation"
import Icon from "react-native-vector-icons/Ionicons"

console.disableYellowBox = true

const AppNavigator = createBottomTabNavigator(
  {
    영웅평가: {
      screen: HeroEvaluation,
      navigationOptions: () => ({
        tabBarIcon: ({ tintColor }) => <Icon name="logo-ionic" color={tintColor} size={24} />
      })
    },
    아이템평가: {
      screen: ItemEvaluation,
      navigationOptions: () => ({
        tabBarIcon: ({ tintColor }) => <Icon name="logo-html5" color={tintColor} size={24} />
      })
    },
    시너지: {
      screen: Synergy,
      navigationOptions: () => ({
        tabBarIcon: ({ tintColor }) => <Icon name="md-apps" color={tintColor} size={24} />
      })
    }
  },
  {
    initialRouteName: "영웅평가",
    tabBarOptions: {
      showLabel: true, // hide labels
      activeTintColor: "#F8F8F8", // active icon color
      inactiveTintColor: "#586589", // inactive icon color,
      tabStyle: {
        backgroundColor: "#171F33" // TabBar background
      }
    }
  }
)

const AppContainer = createAppContainer(AppNavigator)

class App extends Component {
  render() {
    return (
      <Provider store={store}>
        <AppContainer />
      </Provider>
    )
  }
}

export default App
