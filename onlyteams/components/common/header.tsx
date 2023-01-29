import Head from "next/head";
import Image from "next/image";
import { Inter } from "@next/font/google";
import styles from "../styles/Home.module.css";

const inter = Inter({ subsets: ["latin"] });

export default function Header() {
  return (
    <header>
      <div className="text-center align-center bg-white h-24">
        <h1 className="text-2xl text-green-900"> CBRE</h1>
        <h1 className="text-4xl text-green-900">OnlyTeams</h1>
      </div>
    </header>
  );
}
