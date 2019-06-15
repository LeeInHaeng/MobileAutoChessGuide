import React from "react"
import { ImagePath } from "../../../lib/index"
import { StyleSheet, Text, Image } from "react-native"
import { SectionGrid } from "react-native-super-grid"

const s = StyleSheet.create({
  title: {
    fontSize: 24,
    marginVertical: 10,
    marginLeft: "2.5%"
  },
  rowImage: {
    height: 80,
    width: 80
  }
})

const Job = ({ list }) => {
  const mecahanic = list.filter(item => item.jobName === "기계")
  const knight = list.filter(item => item.jobName === "나이트")
  const druid = list.filter(item => item.jobName === "드루이드")
  const magician = list.filter(item => item.jobName === "마법사")
  const hunter = list.filter(item => item.jobName === "사냥꾼")
  const demon_hunter = list.filter(item => item.jobName === "악마사냥꾼")
  const assassin = list.filter(item => item.jobName === "암살자")
  const warrior = list.filter(item => item.jobName === "전사")
  const sorcerer = list.filter(item => item.jobName === "주술사")
  const dark_magician = list.filter(item => item.jobName === "흑마법사")

  return (
    <SectionGrid
      itemDimension={90}
      fixed
      spacing={20}
      sections={[
        {
          title: "기계",
          data: mecahanic
        },
        {
          title: "나이트",
          data: knight
        },
        {
          title: "드루이드",
          data: druid
        },
        {
          title: "마법사",
          data: magician
        },
        {
          title: "사냥꾼",
          data: hunter
        },
        {
          title: "악마사냥꾼",
          data: demon_hunter
        },
        {
          title: "암살자",
          data: assassin
        },
        {
          title: "전사",
          data: warrior
        },
        {
          title: "주술사",
          data: sorcerer
        },
        {
          title: "흑마법사",
          data: dark_magician
        }
      ]}
      renderItem={({ item }) => <Image style={s.rowImage} source={ImagePath[item.unitName]} />}
      renderSectionHeader={({ section }) => <Text style={s.title}>{section.title}</Text>}
    />
  )
}

export default Job
