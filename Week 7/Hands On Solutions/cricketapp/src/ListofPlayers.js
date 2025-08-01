import React from "react";

function ListofPlayers() {
  // Array of players with names and scores
  const players = [
    { name: "Virat", score: 95 },
    { name: "Rohit", score: 85 },
    { name: "Dhoni", score: 92 },
    { name: "Jadeja", score: 65 },
    { name: "Rahul", score: 72 },
    { name: "Shikhar", score: 50 },
    { name: "Pant", score: 88 },
    { name: "Hardik", score: 77 },
    { name: "Ashwin", score: 68 },
    { name: "Bumrah", score: 40 },
    { name: "Shami", score: 55 },
  ];

  // Filter players with score below 70 using arrow function
  const lowScorers = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>🏏 List of Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h3>🔍 Players with score below 70:</h3>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ListofPlayers;
