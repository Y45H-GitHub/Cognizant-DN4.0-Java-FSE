import React from "react";

function IndianPlayers() {
  const allPlayers = [
    "Kohli",
    "Rohit",
    "Dhawan",
    "Pant",
    "Jadeja",
    "Shami",
    "Bumrah",
    "KL Rahul",
  ];

  // Destructure odd and even team players
  const oddTeam = allPlayers.filter((_, index) => index % 2 === 0);
  const evenTeam = allPlayers.filter((_, index) => index % 2 !== 0);

  // Destructuring ES6 Example
  const [player1, player2, ...restPlayers] = allPlayers;

  // Merge two arrays using spread operator (ES6)
  const T20players = ["Kohli", "Pant", "Bumrah"];
  const RanjiPlayers = ["Pujara", "Rahane", "Saha"];
  const mergedPlayers = [...T20players, ...RanjiPlayers];

  return (
    <div>
      <h2>🇮🇳 Indian Players Component</h2>

      <h3>🧢 Odd Team Players:</h3>
      <ul>
        {oddTeam.map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
      </ul>

      <h3>🎽 Even Team Players:</h3>
      <ul>
        {evenTeam.map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
      </ul>

      <h3>🫂 Merged T20 & Ranji Trophy Players:</h3>
      <ul>
        {mergedPlayers.map((player, idx) => (
          <li key={idx}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
